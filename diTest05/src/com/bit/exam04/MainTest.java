package com.bit.exam04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BookStoreConfig.class);
		
		BookStore bs = (BookStore)context.getBean("bs");
		bs.service();
	}

}
