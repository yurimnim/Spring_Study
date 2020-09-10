package com.bit.exam05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptApp {
	public static void main(String[] args) {
			
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam05/beans.xml");
		Dept d = (Dept)context.getBean("d");
		d.info();
	}
}
