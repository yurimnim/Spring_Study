package com.bit.exam02;

public class BookDao {
	private Book book;

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void insert() {
		System.out.println("도서등록완료");
		book.info();
	}
}

//xml방식의 객체제공을 위한 환경설정 파일을 만들고 그것을 실험하기 위한 메인메소드를 만들어보자. 