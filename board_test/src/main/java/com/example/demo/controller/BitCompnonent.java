package com.example.demo.controller;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class BitCompnonent {
	
	@Scheduled(fixedRate=10000)
	public void pro() {
		System.out.println("call~~~");
	}
}
