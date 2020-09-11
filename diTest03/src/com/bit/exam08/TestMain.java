package com.bit.exam08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext();
		DeptDao dao = (DeptDao)context.getBean("com/bit/exam08/beans.xml");
		dao.insert();
	}

}
