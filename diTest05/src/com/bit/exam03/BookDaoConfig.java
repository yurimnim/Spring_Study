package com.bit.exam03;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookDaoConfig {
	
	@Bean(autowire = Autowire.BY_TYPE)
	public BookDao dao() {
		BookDao dao = new BookDao();
		return dao;
	}
}
