package com.bit.exam06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam06/beans.xml");
		ProtocolHandler ph = (ProtocolHandler)context.getBean("ph");
		ph.pro();
	}
}
