package com.bit.exam05;

public class Dept {
	private int dno;
	private String dname;
	private String dloc;
	
	public void setDno(int dno) {
		this.dno = dno;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	
	@Override
	public String toString() {
		return "부서 [부서번호=" + dno + ", 부서명=" + dname + ", 부서위치=" + dloc + "]";
	}
}
