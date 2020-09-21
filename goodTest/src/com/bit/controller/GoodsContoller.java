package com.bit.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.GoodsDao;
import com.bit.vo.GoodsVo;

@Controller
public class GoodsContoller {
	
	@Autowired
	private GoodsDao dao;
		
	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/listGoods.do")
	public void list(Model model) {
		model.addAttribute("list", dao.findAll());
	}
	
	//디테일
	@RequestMapping("/detailGoods.do")
	public void detail(Model model, int no) {
		model.addAttribute("d", dao.detail(no));
	}
	
	//삽입
	@RequestMapping(value="insertGoods.do", method=RequestMethod.GET)
	public void insertForm() {
		
	}
	
	@RequestMapping(value="insertGoods.do", method=RequestMethod.POST)
	public ModelAndView insert(GoodsVo g, HttpServletRequest request) {
		String path = request.getRealPath("/image");
		System.out.println("path: " + path);
		MultipartFile uploadFile = g.getUploadFile();
		String fname = uploadFile.getOriginalFilename();
		g.setFname(fname);
		try {
			byte []data = uploadFile.getBytes();
			FileOutputStream fos = new FileOutputStream(path+ "/" + fname);
			fos.write(data);
			fos.close();
		} catch (Exception e) {
			System.out.println("파일업로드 예외: " + e.getMessage());
		}
		ModelAndView mav = new ModelAndView("redirect:/listGoods.do");
		int re = dao.insert(g);
		if(re<=0) {
			mav.addObject("msg", "물품등록오류");
			mav.setViewName("error");
		}
		return mav;
	}
	
	//수정
		@RequestMapping(value="updateGoods.do", method=RequestMethod.GET)
		public ModelAndView updateForm(int no) {
			ModelAndView mav = new ModelAndView();
			mav.addObject("g", dao.detail(no));
			return mav;
		}
		
		@RequestMapping(value="updateGoods.do", method=RequestMethod.POST)
		public ModelAndView update(GoodsVo g, HttpServletRequest request) {
			
			
			ModelAndView mav = new ModelAndView("redirect:/listGoods.do");
			int re = dao.update(g);
			if(re<=0) {
				mav.addObject("msg", "물품수정오류");
				mav.setViewName("error");
			}
			return mav;
		}
		
	//삭제
		@RequestMapping("/deleteGoods.do")
		public ModelAndView delete(int no) {
			ModelAndView mav = new ModelAndView("redirect:/listGoods.do");
			int re = dao.delete(no);
			if(re<=0) {
				mav.addObject("msg", "물품삭제오류");
				mav.setViewName("error");
			}
			return mav;
		}
	}
