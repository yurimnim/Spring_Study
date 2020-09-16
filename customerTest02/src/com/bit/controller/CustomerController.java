package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.CustomerDao;
import com.bit.vo.CustomerVo;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerDao dao;
	
	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/detailCustomer.do")
	public ModelAndView detail(int custid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", dao.detail(custid));
		return mav;
	}

	@RequestMapping("/listCustomer.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll());
		return mav;
	}
	
	@RequestMapping(value="insertCustomer.do", method=RequestMethod.POST)
	public ModelAndView insert(CustomerVo c) {
		ModelAndView mav = new ModelAndView("redirect:/listCustomer.do");
		int re = dao.insert(c);
		if(re<=0){
			mav.addObject("msg","고객등록오류");
			mav.setViewName("error");
		}
		return mav;
	}
	
	@RequestMapping(value="insertCustomer.do", method=RequestMethod.GET)
	public void insertForm() {
		
	}
}

