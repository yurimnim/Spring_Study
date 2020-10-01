package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class insertMemberController {
	
//	@Autowired
//	private MemberDao dao;
//	
//	public void setDao(MemberDao dao) {
//		this.dao = dao;
//	}
	
	@RequestMapping(value="/insertMember.do", method=RequestMethod.GET)
	public void joinForm() {
		
	}
	
	@RequestMapping(value="/insertMember.do", method=RequestMethod.POST)
	public ModelAndView joinSubmit() {
		ModelAndView mav = new ModelAndView();
//		int re = dao.insertMember(m);
//		if(re<=0) {
//			mav.addObject("msg","회원가입 오류");
//			mav.setViewName("error");
//		}
		return mav;
	}
	
	

}
