package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bit.dao.CustomerDao;
import com.bit.vo.CustomerVo;

@Controller
public class CustomerController {
	
	private CustomerDao dao;

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}
	
	
	//고객등록
		@RequestMapping("/deleteCustomer.do")
		public ModelAndView delete(int custid) {
			ModelAndView mav = new ModelAndView();
			int re = dao.delete(custid);
			if(re>0) {
				mav.setViewName("redirect:/listCustomer.do");
			}else {
				mav.addObject("msg","고객삭제오류");
				mav.setViewName("error");
			}
			return mav;
		}
	
	//고객등록
	@RequestMapping("/insertCustomerOk.do")
	public ModelAndView insertOk(CustomerVo c) {
		ModelAndView mav = new ModelAndView();
		int re = dao.insert(c);
		mav.addObject("re", re);
		return mav;
	}

	@RequestMapping("/insertCustomer.do")
	public void insert() {
	
	}
	
	//고객정보
	@RequestMapping("/detailCustomer.do")
	public ModelAndView detail(int custid) {
		ModelAndView mav = new ModelAndView();
		CustomerVo ct = dao.getCustomer(custid);
		mav.addObject("title","고객정보");
		mav.addObject("ct",ct);
		mav.setViewName("detailCustomer");
		return mav;
	}
	
	//리스트
	@RequestMapping("/listCustomer.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("title","고객목록");
		mav.addObject("list",dao.listAll());
		mav.setViewName("listCustomer");
		return mav;
	}
}
