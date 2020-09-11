package com.bit.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam01/beans.xml");
		WriteArticleServiceImpl ws = (WriteArticleServiceImpl)context.getBean("ws");
		ws.service();
	}

}
