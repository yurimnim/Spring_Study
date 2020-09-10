package com.bit.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
//		Person p = new Person();
//		p.pro();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam02/beans.xml");		
		Person p = (Person)context.getBean("p");
		p.pro();
	}

}
