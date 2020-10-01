package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.dao.MemberDao;
import com.example.demo.vo.MemberVo;

import kr.co.youiwe.webservice.JoinSms;

@Controller
public class JoinMemberController {
	
	@Autowired
	private MemberDao dao;
	
	public void setDao(MemberDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="/insertMember.do", method=RequestMethod.GET)
	public void joinForm() {
		
	}
	
	@RequestMapping(value="/insertMember.do", method=RequestMethod.POST)
	public ModelAndView joinSubmit(MemberVo m) {
		ModelAndView mav = new ModelAndView("redirect:/listBoard.do");
		int re = dao.insertMember(m);
		if(re<=0) {
			mav.addObject("msg","회원가입 오류");
			mav.setViewName("error");
		}
		return mav;
	}


}
