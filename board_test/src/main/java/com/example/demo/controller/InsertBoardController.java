package com.example.demo.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.BoardDao;
import com.example.demo.vo.BoardVo;

@Controller
@RequestMapping("/insertBoard.do")
public class InsertBoardController {
	
	@Autowired
	private BoardDao dao;
	
	public void setDao(BoardDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public void insertForm(@RequestParam(value="no", defaultValue = "0") int no, Model model) {
		model.addAttribute("no", no);
		String title ="";
		if(no != 0) {
			title = "답글) " + dao.detail(no).getTitle();			
		}
		model.addAttribute("title", title);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView insert(BoardVo b, HttpServletRequest requset) {
		ModelAndView mav = new ModelAndView("redirect:/listBoard.do");
		b.setIp(requset.getRemoteAddr());
		
		int pno = b.getNo();
		int no = dao.getNextNo();
		int b_level = 0;
		int b_ref = no;
		int b_step = 0;
		if(pno != 0) {
			BoardVo p = dao.detail(no);
			b_ref = p.getB_ref();
			b_level = p.getB_level();
			b_step = p.getB_step();
			HashMap map = new HashMap();
			map.put("b_ref", b_ref);
			map.put("b_level", b_level);
			map.put("b_step", b_step);
			dao.updateStep(map);
			b_level++;
			b_step++;
		}
		b.setNo(no);
		b.setB_level(b_level);
		b.setB_ref(b_ref);
		b.setB_step(b_step);
				
		String path = requset.getRealPath("image");
		MultipartFile uploadFile = b.getUploadFile();
		String fname = uploadFile.getOriginalFilename();
		byte[] data = null;
		
		if(fname != null && !fname.equals("")) {
			try {
				data = uploadFile.getBytes();
			} catch (Exception e) {
				System.out.println("파일업로드 예외발생 " + e.getMessage());
			}
		}else {
			fname = "";
		}
		b.setFname(fname);		
		System.out.println(fname);
		
		int re = dao.insert(b);
		if(re<=0) {
			mav.addObject("msg", "새글등록오류");
			mav.setViewName("error");
		}else { 
			try {
				if(!fname.equals("")) {
					data = uploadFile.getBytes();
					FileOutputStream fos = new FileOutputStream(path + "/" + fname);
					fos.write(data);
					fos.close();
				}	
			} catch (Exception e) {
				System.out.println("사진 업로드2 예외발생 " + e.getMessage());
			}
		}
		return mav;
	}
}
