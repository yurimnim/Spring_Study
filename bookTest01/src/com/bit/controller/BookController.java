package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BookDao;
import com.bit.vo.BookVo;

@Controller
public class BookController {
	private BookDao dao;
	
	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	//책삭제 
		@RequestMapping("/deleteBookOk.do")
		public ModelAndView deleteSubmit(int bookid) {
			ModelAndView mav = new ModelAndView();
			int re= dao.deleteBook(bookid);
			mav.addObject("re", re);
			return mav;
		}
	
	//책수정 
//	@RequestMapping("/updateBookOk.do")
//	public ModelAndView updateSubmit(BookVo b) {
//		ModelAndView mav = new ModelAndView();
//		int re= dao.updateBook(b);
//		mav.addObject("re", re);
//		return mav;
//	}
//	
//	@RequestMapping("/updateBook.do")
//	public ModelAndView updateForm(int bookid) {
//		System.out.println("도서번호:"+bookid);
//		ModelAndView mav = new ModelAndView("updateBook");
//		mav.addObject("b",dao.getBook(bookid));
//		return mav;	
//	}

	//책등록 
	@RequestMapping("/insertBookOk.do")
	public ModelAndView insertSubmit(BookVo b) {
		ModelAndView mav = new ModelAndView();
		int re= dao.insertBook(b);
		mav.addObject("re", re);
		return mav;
	}
	
	@RequestMapping("/insertBook.do")
	public void insertForm() {
	
	}
	
	//책정보
	@RequestMapping("/detailBook.do")
	public ModelAndView detail(int bookid) {
		System.out.println("도서번호:"+bookid);
		ModelAndView mav = new ModelAndView("detailBook");
		mav.addObject("b",dao.getBook(bookid));
		return mav;
	}
	
	@RequestMapping("/listBook.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("title", "도서목록");
		mav.addObject("list", dao.listAll());
		mav.setViewName("listBook");
		return mav;
	}
	
}
