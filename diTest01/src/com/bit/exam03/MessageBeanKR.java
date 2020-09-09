package com.bit.exam03;

import com.bit.exam02.MessageBean;

public class MessageBeanKR implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println(name + " 님 안녕하세요.");
	}

}
