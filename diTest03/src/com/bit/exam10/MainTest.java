package com.bit.exam10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("1");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam10/beans.xml");
		System.out.println("2");
		Person p = (Person)context.getBean("person");
		Person p1 = (Person)context.getBean("person");
		
		System.out.println("3");
		System.out.println(p);
		System.out.println(p1);
		
	}

}
