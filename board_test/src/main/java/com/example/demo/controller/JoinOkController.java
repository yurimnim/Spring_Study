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
	public ModelAndView submit(String num, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		String sendMsg = (String)session.getAttribute("sendMsg");
		if(sendMsg.equals(num)) {
			session.setAttribute("msg", "휴대폰 번호 인증성공");
			mav.setViewName("redirect:/joinBoard.do");
		}else {
			session.setAttribute("msg", "휴대폰 번호 인증실패");
			mav.setViewName("redirect:/join.do");
		}
		return mav;
	}
		
}
