package com.bit.exam13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam13/beans_13.xml");
		JobExecuter je = (JobExecuter)context.getBean("job");
		je.print();
  }
}
