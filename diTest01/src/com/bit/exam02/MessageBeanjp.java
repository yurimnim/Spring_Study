package com.bit.exam02;

public class MessageBeanjp implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("こんにちは。" + name);
	}
}
