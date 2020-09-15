package com.bit.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		BookDao dao = (BookDao)context.getBean("bookdao");
		dao.insert();
		
  }
}

//어노테이션 기반의 객체제공을 위한 환경설정 파일을 만들고 
//결과를 확인해보자. 
