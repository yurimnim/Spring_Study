package com.example.demo.controller;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {

	@Autowired
	private MailSender javaMailSender;

	public void setJavaMailSender(MailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
//	@RequestMapping("/mail.do")
//	public String mail()
//	{
//		String r  = "";
//		SimpleMailMessage mailMessage = new SimpleMailMessage();
//		mailMessage.setSubject("회원가입안내");
//		mailMessage.setFrom("");
//		mailMessage.setText("회원가입을 환영합니다.");
//		mailMessage.setTo("u007x2@me.com");
//		try {
//			javaMailSender.send(mailMessage);
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return r;
//	}
	
	@RequestMapping(value="/mail.do",method=RequestMethod.GET)
	public void emailForm() {
		
	}
	
	@RequestMapping(value="/mail.do",method=RequestMethod.POST)
	public ModelAndView emailSend(String to, HttpSession session) {
		ModelAndView mav = new ModelAndView("redirect:/mailScan.do");
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		Random r = new Random();
		String check = r.nextInt(10) + "" + r.nextInt(10) + "" + r.nextInt(10) + "" + r.nextInt(10) + "";
		mailMessage.setSubject("가입인증번호 입니다.");
		mailMessage.setFrom("u007x2@me.com");
		mailMessage.setTo(to);
		mailMessage.setText(check + " 인증번호를 입력창에 입력하세요!");
		session.setAttribute("check",check);
		
		try {
			javaMailSender.send(mailMessage);
		}catch (Exception e) {
			System.out.println("이메일보내기 오류발생 " + e.getMessage());
		}
		mav.addObject("msg", "인증번호를 보냈어요!");
		
		return mav;
	}
	
	@RequestMapping(value="/mailScan.do",method=RequestMethod.GET)
	public void emailCheck() {
		
	}
	
	@RequestMapping(value="/mailScan.do",method=RequestMethod.POST)
	public ModelAndView emailScanOk(String scan, HttpSession session) {
		ModelAndView mav = new ModelAndView("redirect:/insertMember.do");
		String check = (String)session.getAttribute("check");
		mav.addObject("msg", "메일인증완료");
		if(!scan.equals(check)) {
			mav.setViewName("mail");
			mav.addObject("msg", "메일 인증에 실패했어요... ");
		}
		return mav; 
	}
}





