package com.bit.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.vo.PersonVo;

@Controller
public class PersonController {
	
	@RequestMapping("/person.do")
	public ModelAndView pro() { 
		ModelAndView mav = new ModelAndView();
//		PersonVo p = new PersonVo();
//		p.setName("홍길동");
//		p.setAge(20);
//		p.setAddr("서울");
//		mav.addObject("p", p);
		HashMap p= new HashMap();
		p.put("name","홍길동");
		p.put("age",20);
		p.put("addr","서울");
		return mav;
	}
}
