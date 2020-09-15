package com.bit.exam04;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CustomerConfig.class, CustomerDaoConfig.class, BookConfig.class, BookDaoConfig.class})
public class BookStoreConfig {
	
	@Bean(autowire = Autowire.BY_TYPE)
	public BookStore bs() {
		BookStore bs = new BookStore();
		return bs;
	}
}
