package com.bit.exam04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam04/beans.xml");
		Person p = (Person)context.getBean("p"); 
		p.pro();
	}

}
