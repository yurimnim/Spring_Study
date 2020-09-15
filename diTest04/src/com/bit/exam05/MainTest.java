package com.bit.exam05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		DeptDao dao = (DeptDao)context.getBean("dao");
		dao.insert();
	}
}
