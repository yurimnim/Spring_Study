package com.bit.exam03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {
	
	@Bean
	public Book book() {
		return new Book(0001, "비트비트 ", "bit", 2000);
	}
}
