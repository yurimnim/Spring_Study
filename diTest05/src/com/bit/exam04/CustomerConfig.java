package com.bit.exam04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	
	@Bean
	public Customer customer() {
		return new Customer(100, "고길동", "서울");
		
	}
}
