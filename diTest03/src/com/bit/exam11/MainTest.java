package com.bit.exam11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	 public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam11/beans.xml");
		SystemMonitor sm = (SystemMonitor)context.getBean("sm");
		
		
	}
}
