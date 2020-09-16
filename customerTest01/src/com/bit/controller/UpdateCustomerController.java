package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.CustomerDao;
import com.bit.vo.CustomerVo;

@Controller
@RequestMapping("/updateCustomer.do")
public class UpdateCustomerController {
	
	private CustomerDao dao;
	
	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView insert(int custid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", dao.getCustomer(custid));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submit(CustomerVo c) {
		ModelAndView mav = new ModelAndView("redirect:/listCustomer.do");
		int re = dao.update(c);		
		if(re <= 0) {
			mav.addObject("msg", "고객 수정에 실패하였습니다.");
			mav.setViewName("error");
		}
		return mav;
	}
}
