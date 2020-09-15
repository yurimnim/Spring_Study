package com.bit.exam04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {
	
	@Bean
	public Book book() {
		return new Book(100, "몰디브 한잔 ", "병헌출판사", 2000);
	}
}
