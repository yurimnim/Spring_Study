package com.bit.exam05;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public UpdateInfo info(){
		return new UpdateInfo();
	}
	
	@Bean(autowire = Autowire.BY_TYPE, initMethod = "init")
	public MemberService ms() {
		MemberService ms = new MemberService();
		return ms;
	}
}
