package com.bit.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptApp {
	public static void main(String[] args) {
		
//		Dept d = new Dept(0001, "자바부", "신촌");	

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam03/beans.xml");
		Dept d = (Dept)context.getBean("d");
		d.info();
		
		Dept d2 = (Dept)context.getBean("d2");
		d2.info();
	}
}
