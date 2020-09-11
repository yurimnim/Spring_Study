package com.bit.exam04;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public SmsSender sender() {
		SmsSender s = new SmsSender();
		s.setFrom("탁재훈");
		s.setTo("신정환");
		return s;	
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public SystemMonitor sm() {
		SystemMonitor sm = new SystemMonitor();
		sm.setPeriodTime(20);
		return sm;
	}
 }
