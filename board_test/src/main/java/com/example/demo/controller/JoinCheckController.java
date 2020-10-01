package com.example.demo.controller;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.youiwe.webservice.JoinSms;

@Controller
@RequestMapping("/join.do")
public class JoinCheckController {
	
	@RequestMapping(method=RequestMethod.GET)
	public void form() {
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView submit(String to,HttpSession session) {
		Random r = new Random();
		String msg = r.nextInt(10) + "" + r.nextInt(10) +"" + r.nextInt(10)+"" + r.nextInt(10)+"";
		JoinSms.sendMsg(to, msg);
		session.setAttribute("sendMsg", msg);
		ModelAndView mav = new ModelAndView("redirect:/joinOk.do");
		return mav;
	}
}
