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
public class JoinController {
	
	@RequestMapping(method = RequestMethod.GET)
	public void form() {
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submit(String to, HttpSession session) {
		ModelAndView mav  = new ModelAndView("redirect:/joinOk.do");
		Random r = new Random();
		String msg = r.nextInt(10) + "" + r.nextInt(10) + "" + r.nextInt(10) + "" + r.nextInt(10) + "";
		session.setAttribute("sendMsg", msg);
		JoinSms js = new JoinSms();
		String re = js.sendMsg("01096873487",to,msg); 
		if(!re.equals("1")) {
			mav.setViewName("join");
		}
		return mav;
	}

}
