package com.bit.exam02;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Book book() {
		Book book = new Book(001, "핀란드", "핀란드여행사", 2000);
		return book;
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public BookDao bookdao() {
		BookDao dao = new BookDao();
		return dao;
	}
}
