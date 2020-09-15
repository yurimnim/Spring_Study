package com.bit.exam04;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerDaoConfig {
	
	@Bean(autowire = Autowire.BY_TYPE)
	public CustomerDao cDao() {
		CustomerDao customerDao = new CustomerDao();
		return customerDao;
	}
}
