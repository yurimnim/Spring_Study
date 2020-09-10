package com.bit.exam13;

public class JobExecuter {
	
	public JobExecuter(String name, int seconds) {
		System.out.println("생성자 호출 1");
	}
	
	public JobExecuter(String name, long seconds) {
		System.out.println("생성자 호출 2");
	}

//	public JobExecuter(String name, String seconds) {
//		System.out.println("생성자 호출 3");
//	}
//	
	public void print() {
		System.out.println("yes");
	}
}
