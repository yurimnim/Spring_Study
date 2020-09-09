package com.bit.exam03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {

	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam03/beans.xml");
		MessageBean mb = (MessageBean) context.getBean("mb");
		mb.sayHello("tiger");
		//한국말로 인사하도록 바꿔보자 
		
	}
}
