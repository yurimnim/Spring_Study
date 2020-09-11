package com.bit.exam05;

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

//의존관계 자동설정을 이용한 xml을 작성하고 main 메소드를 만들어 결과를 확인해보자. 