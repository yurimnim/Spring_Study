package com.bit.exam03;

public class DeptDao {
	private Dept dept;

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	public void insert() {
		System.out.println("등록완료");
		System.out.println(dept);
	}
}
