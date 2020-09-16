package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.DeptDao;

@Controller
public class DeptController {
	
	private DeptDao dao;
	
	public void setDao(DeptDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/listDept.do")
	public ModelAndView list() {
//		System.out.println("controller is up and running");
		ModelAndView mav = new ModelAndView();
		mav.addObject("title", "부서목록");
		mav.addObject("list", dao.listAll());
		mav.setViewName("listDept");
		return mav;
	}
}
