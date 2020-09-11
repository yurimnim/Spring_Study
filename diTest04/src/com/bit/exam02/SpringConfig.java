package com.bit.exam02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Person ps() {		
		Person p = new Person();
		p.setName("고길동");
		p.setAge(30);
		return p;
	}
}
