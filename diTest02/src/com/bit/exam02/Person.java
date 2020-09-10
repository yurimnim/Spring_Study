package com.bit.exam02;

public class Person {
	private String name;
	private int age;
		
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("매개변수를 갖는 생성자가 동작한다.");
	}

	public Person() {
		System.out.println("생성자 동작함 ");
	}

	public void pro() {
		System.out.println("Person의 pro");
		System.out.println("name: " + name);
		System.out.println("name: " + age);
	}
}
