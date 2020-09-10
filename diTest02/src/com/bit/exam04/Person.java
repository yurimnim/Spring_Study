package com.bit.exam04;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void pro() {
		System.out.println("Person의 pro");
		System.out.println("name: " + name);
		System.out.println("name: " + age);
	}
}
