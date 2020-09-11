package com.bit.exam04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberTest {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/bit/exam04/m_beans.xml");
		MemberDao md = (MemberDao)context.getBean("md");
		md.insert();
	}
}
