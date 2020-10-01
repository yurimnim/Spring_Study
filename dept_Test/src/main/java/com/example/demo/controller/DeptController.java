package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.DeptDao;
import com.example.demo.vo.DeptVo;

@Controller
public class DeptController {
	@Autowired
	private DeptDao dao;
	
	public void setDao(DeptDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/listDept.do")
	public void list(Model model) {
		model.addAttribute("list", dao.listAll());
	}
	
	@RequestMapping(value="insertDept.do", method=RequestMethod.GET)
	public void insertForm() {
		
	}
	
	@RequestMapping(value="insertDept.do", method=RequestMethod.POST)
	public ModelAndView insertForm(DeptVo d) {
		ModelAndView mav = new ModelAndView("redirect:/listDept.do");
		int re = dao.insert(d);
		if(re<=0) {
			mav.addObject("msg","부서등록실패");
			mav.setViewName("error");
		}
		return mav;
	}
}
