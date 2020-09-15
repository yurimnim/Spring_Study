package com.bit.exam05;

public class MemberService {
	
	private UpdateInfo info;

	public void setInfo(UpdateInfo info) {
		this.info = info;
	}
	
	public void init() {
		System.out.println("init 수행됨");
		info.update("maniac");
	}
}
