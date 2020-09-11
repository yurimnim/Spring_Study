package com.bit.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam03/d_beans.xml");
		DeptDao dao = (DeptDao)context.getBean("deptDao");
		dao.insert();
	}

}
