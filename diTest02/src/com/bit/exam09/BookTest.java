package com.bit.exam09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam09/beans.xml");	
		BookDao dao = (BookDao)context.getBean("bookdao");
		dao.insert();
	
	}
}
