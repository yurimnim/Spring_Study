package com.bit.exam04;

public class Customer {
	private int cno;
	private String cname;
	private String addr;
	
	public Customer(int cno, String cname, String addr) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.addr = addr;
	}
	
	public void info() {
		System.out.println("고객번호:" + cno);
		System.out.println("고객명:" + cname);
		System.out.println("고객주소:" + addr);
	}
	
}
