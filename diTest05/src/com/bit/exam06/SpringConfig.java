package com.bit.exam06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	
	@Bean
//	@Scope(value="singletone")
	public Person person() {
		return new Person("고길동", 18);
	}
}
