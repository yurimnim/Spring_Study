package com.bit.exam04;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String addr;
	private String tel;

	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", addr=" + addr + ", tel=" + tel + "]";
	}

}
