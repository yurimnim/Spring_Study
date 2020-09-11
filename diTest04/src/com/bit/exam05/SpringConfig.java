package com.bit.exam05;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Dept dept() {
		Dept d = new Dept();
		d.setDloc("몰디브");
		d.setDno(100);
		d.setDname("복지부");
		return d;
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public DeptDao dao() {
		DeptDao dao = new DeptDao();
		return dao;
	}
}
