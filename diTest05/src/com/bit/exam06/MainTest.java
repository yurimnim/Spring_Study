package com.bit.exam06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Person p1 = (Person)context.getBean("person");
		Person p2 = (Person)context.getBean("person");
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.setAge(40);
		System.out.println(p1);
		System.out.println(p2);
	}
}
