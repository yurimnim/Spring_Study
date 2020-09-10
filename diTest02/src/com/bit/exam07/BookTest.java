package com.bit.exam07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam07/book.xml");
		Book b = (Book)context.getBean("b");
		b.bookInfo();
	}
}
