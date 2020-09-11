package com.bit.exam03;

public class SmsSender {
	private String from;
	private String to;
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public void send() {
		System.out.println("from:" + from +" to" + to );
	}

}
