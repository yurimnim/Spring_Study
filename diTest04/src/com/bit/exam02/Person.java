package com.bit.exam02;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void info() {
		System.out.println("이름:" + name + " 나이:" + age);
	}
}
//annotation 기반으로 객체를 제공하도록 환경설정 파일을 만들고 그것을 사용하는 main 메소드를 작성해보자. 
