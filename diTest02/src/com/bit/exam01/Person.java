package com.bit.exam01;

public class Person {
	private String name;
	private int age;
		
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		System.out.println("생성자 동작함 ");
	}

	public void pro() {
		System.out.println("Person의 pro");
	}
}
