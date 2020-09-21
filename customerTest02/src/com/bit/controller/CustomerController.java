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
	
	//디테일
	@RequestMapping("/detailCustomer.do")
	public ModelAndView detail(int custid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", dao.detail(custid));
		return mav;
	}
	
	//리스트 
	@RequestMapping("/listCustomer.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll());
		return mav;
	}
	
	//인서트
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
	
	//수정 
	@RequestMapping(value="updateCustomer.do", method=RequestMethod.POST)
	public ModelAndView update(CustomerVo c) {
		ModelAndView mav = new ModelAndView("redirect:/listCustomer.do");
		int re = dao.update(c);
		if(re<=0){
			mav.addObject("msg","고객수정오류");
			mav.setViewName("error");
		}
		return mav;
	}
	
	@RequestMapping(value="updateCustomer.do", method=RequestMethod.GET)
	public ModelAndView updateForm(int custid) {
		System.out.println(custid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("c",dao.detail(custid));
		return mav;
	}
	
	//삭제
	@RequestMapping("/deleteCustomer.do")
	public ModelAndView delete(int custid) {
		ModelAndView mav = new ModelAndView("redirect:/listCustomer.do");
		int re = dao.delete(custid);
		if(re<=0) {
			mav.addObject("msg","고객삭제오류");
			mav.setViewName("error");
		}
		return mav;
	}
}

