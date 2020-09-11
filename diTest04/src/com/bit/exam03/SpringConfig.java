package com.bit.exam03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public SystemMonitor sm() {
		SystemMonitor sm = new SystemMonitor();
		SmsSender ss = new SmsSender();
		ss.setFrom("둘리");
		ss.setTo("또치");
		
		sm.setPeriodTime(10);
		sm.setSmsSender(ss);
		
		return sm;
	}
}
