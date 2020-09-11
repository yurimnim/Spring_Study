package com.bit.exam07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam07/beans.xml");
		SystemMoniter sm = (SystemMoniter)context.getBean("sm");
		sm.monitor();

	}

}
