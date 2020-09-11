package com.bit.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam02/beans3.xml");
		SystemMoniter sm = (SystemMoniter)context.getBean("systemMoniter");
		sm.monitor();
	}
}
