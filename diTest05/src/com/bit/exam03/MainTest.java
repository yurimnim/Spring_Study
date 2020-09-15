package com.bit.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class, BookDaoConfig.class);
		BookDao dao = (BookDao)context.getBean("dao");
		
		dao.insert();

	}

}
