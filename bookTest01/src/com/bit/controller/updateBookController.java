package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BookDao;
import com.bit.vo.BookVo;

@Controller
@RequestMapping("/updateBook.do")
public class updateBookController {
	private BookDao dao;
	
	public void setDao(BookDao dao) {
		this.dao = dao;
	}

	@RequestMapping(method= RequestMethod.GET )
	public ModelAndView form(int bookid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("b",dao.getBook(bookid));
		return mav;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView submit(BookVo b) {
		ModelAndView mav = new ModelAndView();
		int re = dao.updateBook(b);
		if(re>0) {
			mav.setViewName("redirect:/listBook.do");
		}else {
			mav.addObject("msg","도서수정오류");
			mav.setViewName("error");
		}
		
		return mav;
	}
}
