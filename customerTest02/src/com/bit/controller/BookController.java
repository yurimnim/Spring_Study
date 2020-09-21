package com.bit.controller;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bit.dao.BookDao;
import com.bit.vo.BookVo;

@Controller
public class BookController {
	
	@Autowired
	private BookDao dao;
	
	@RequestMapping("/listBook.do")
	public ModelAndView bookList(String search, String category, String sort, String op,HttpServletRequest request, HttpSession session) {
//		if(search !=null&& search.trim().equals("")) {
//			search=null;
//		}
		

		if(search == null && session.getAttribute("search")!=null){
			search=(String)session.getAttribute("search");	
			category=(String)session.getAttribute("category");	
		}
		
		HashMap map = new HashMap();
		map.put("search", search);
		map.put("category", category);
		map.put("sort", sort);
		map.put("op", op);
		ModelAndView mav = new ModelAndView();
		
		if(search !=null) {
			session.setAttribute("search", search);		
			session.setAttribute("category", category);	
		}
		
		mav.addObject("list", dao.listAll(map));
		return mav;
	}
	
	@RequestMapping("/detailBook.do")
	public ModelAndView bookDetail(int bookid) {
		//System.out.println(bookid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("b", dao.detail(bookid));
		return mav;
	}
	
	//insert
	@RequestMapping(value ="insertBook.do", method=RequestMethod.POST)
	public ModelAndView insert(BookVo b) {
		ModelAndView mav = new ModelAndView("redirect:/listBook.do");
		int re = dao.insert(b);
		if(re<=0) {
			mav.addObject("msg","도서등록오류");
			mav.setViewName("error");
		}
		return mav;
	}
	
	@RequestMapping(value ="insertBook.do", method=RequestMethod.GET)
	public void insertForm() {
		
	}
	
	//UPDATE
	@RequestMapping(value ="updateBook.do", method=RequestMethod.POST)
	public ModelAndView update(BookVo b) {
		ModelAndView mav = new ModelAndView("redirect:/listBook.do");
		int re = dao.update(b);
		if(re<=0) {
			mav.addObject("msg","도서등록오류");
			mav.setViewName("error");
		}
		return mav;
	}
	
	@RequestMapping(value ="updateBook.do", method=RequestMethod.GET)
	public ModelAndView updateForm(int bookid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("b", dao.detail(bookid));
		return mav;
	}
	
	
	@RequestMapping("/deleteBook.do")
	public ModelAndView delete(int bookid) {
		ModelAndView mav = new ModelAndView("redirect:/listBook.do");
		int re = dao.delete(bookid);
		if(re <= 0) {
			mav.addObject("msg", "도서삭제오류");
			mav.setViewName("error");
		}
		return mav;
	}
	
	
}
