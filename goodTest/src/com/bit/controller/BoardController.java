package com.bit.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BoardDao;
import com.bit.vo.BoardVo;

@Controller
public class BoardController {
	
	@Autowired
	private BoardDao dao; 
	
	public void setDao(BoardDao dao) {
		this.dao = dao;
	}
	
	//목록
	@RequestMapping("/listBoard.do")
	public void list(Model model) {
		model.addAttribute("list", dao.listAll());
	}
	
	//상세
	@RequestMapping("/detailBoard.do")
	public void detail(Model model, int no) {
		model.addAttribute("b", dao.detail(no));
	}
	
	//게시물 등록
	@RequestMapping(value="insertBoard.do", method=RequestMethod.GET)
	public void formInsert() {
		
	}
	
	@RequestMapping(value="insertBoard.do", method=RequestMethod.POST)
	public ModelAndView submit(BoardVo b, HttpServletRequest request) {
		String path = request.getRealPath("/board_upload");
		System.out.println(path);
		MultipartFile uploadFile = b.getUploadFile();
		String fname = uploadFile.getOriginalFilename();
		b.setFname(fname);
		if(!b.getFname().equals("")){
			try {
				byte[] data = uploadFile.getBytes();
				FileOutputStream fos = new FileOutputStream(path + "/" + fname);
				fos.write(data);
				fos.close();
			} catch (Exception e) {
				System.out.println("사진 업로드 예외발생 " + e.getMessage());
			}
		}
		System.out.println(fname);
		ModelAndView mav = new ModelAndView("redirect:/listBoard.do");
		int no = dao.getNextNo();
		int b_ref = no;
		int b_level = 0;
		int b_step = 0;
		b.setNo(no);
		b.setB_ref(b_ref);
		b.setB_level(b_level);
		b.setB_step(b_step);
		int re = dao.insert(b);
		if(re <= 0) {
			mav.addObject("msg", "게시물등록오류");
			mav.setViewName("error");
		}
		return mav;
	}
	
	//게시물 수정
		@RequestMapping(value="updateBoard.do", method=RequestMethod.GET)
		public ModelAndView formUpdate(int no) {
			ModelAndView mav = new ModelAndView();
			mav.addObject("b", dao.detail(no));
			System.out.println(dao.detail(no).getFname());
			return mav;
		}
		
		@RequestMapping(value="updateBoard.do", method=RequestMethod.POST)
		public ModelAndView update(BoardVo b, HttpServletRequest request) {
			String oldFname = b.getFname();
			System.out.println(oldFname);
			String path = request.getRealPath("/board_upload");
			String fname = null;
			MultipartFile uploadFile = b.getUploadFile();
			if(uploadFile != null) {
				fname = uploadFile.getOriginalFilename();
			}
			if(fname != null && !fname.equals("")) {
				b.setFname(fname);
				try {
					byte []data = uploadFile.getBytes();
					FileOutputStream fos = new FileOutputStream(path + "/" + fname);
					fos.write(data);
					fos.close();
				} catch (Exception e) {
					System.out.println("사진수정 예외발생 " + e.getMessage());
				}
			}
			
			ModelAndView mav = new ModelAndView("redirect:/listBoard.do");
			int re = -1;			
			re = dao.update(b);		
			if(re <= 0 ) {
				mav.addObject("msg", "게시물등록오류");
				mav.setViewName("error");
			}
			return mav;
		}
		
		//게시물 삭제
		@RequestMapping("/deleteBoard.do")
		public ModelAndView delete(int no,HttpServletRequest request) {
			ModelAndView mav = new ModelAndView("redirect:/deleteBoard.do");
			return mav;
		}
		
}
