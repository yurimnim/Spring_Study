package com.bit.exam11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.exam10.MemberDao;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/bit/exam11/sm_beans.xml");
		MemberDao md = (MemberDao)context.getBean("md");
		md.insert();
	}
}
