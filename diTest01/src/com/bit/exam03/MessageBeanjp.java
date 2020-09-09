package com.bit.exam03;

public class MessageBeanjp implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("こんにちは。" + name);
	}
}
