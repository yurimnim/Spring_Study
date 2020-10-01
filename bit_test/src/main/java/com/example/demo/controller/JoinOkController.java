package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/joinOk.do")
public class JoinOkController {
	
	@RequestMapping(method=RequestMethod.GET)
	public void form() {
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView submit(String key, HttpSession session) {
		ModelAndView mav = new ModelAndView("redirect:/insertMember.do");
		String sendMsg = (String)session.getAttribute("sendMsg");
		session.setAttribute("msg", "전화번호 인증완료");
		if(!sendMsg.equals(key)) {
			session.setAttribute("msg", "전화번호 인증오류");
			mav.setViewName("redirect:/join.do");
		}
		return mav;
	}
}
