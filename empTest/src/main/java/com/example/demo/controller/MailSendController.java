package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.EmpDao;
import com.example.demo.vo.EmpVo;

@Controller
@Component
@EnableScheduling
public class MailSendController {
	
	@Autowired
	private EmpDao dao;
	
	@Autowired
	private MailSender javaMailSender;

	public void setJavaMailSender(MailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	@RequestMapping("/mail.do")
	@Scheduled(cron="0 11 15 29 * *")
	public void send( ) {
		List<EmpVo> list = null;
		list = dao.listAll();
		for(EmpVo e:list) {
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setSubject(e.getEname() + "의 이번달 급여명세서");
			mailMessage.setFrom("u007x2@me.com");
			mailMessage.setText(e.getEname() + " 님의 이번달 총 급여 - 월급:" + e.getSal() +"만 원정, 상여금: "+ e.getComm() + " 만원 정 입니다. ");
			mailMessage.setTo(e.getEmail());
			try {
				javaMailSender.send(mailMessage);
			}catch (Exception e2) {
				System.out.println("이메일 보내기 오류 " + e2.getMessage());
			}
		}
	}
}
