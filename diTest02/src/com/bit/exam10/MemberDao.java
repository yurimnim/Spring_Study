package com.bit.exam10;

public class MemberDao {
	private Member member;

	public void setMember(Member member) {
		this.member = member;
	}	
	
	public void insert() {
		System.out.println("회원등록");
		System.out.println(member);
	}
}
