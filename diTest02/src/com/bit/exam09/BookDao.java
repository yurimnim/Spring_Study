package com.bit.exam09;

public class BookDao {
	private Book book;

	public BookDao(Book book) {
		super();
		this.book = book;
	}
	
	public void insert() {
		System.out.println("도서를 등록하였습니다.");
		book.info();
	}
}

//bookdao 객체를 제공하는 xml과 그것을 실험하기 위한 메인메소드를 작성하여 결과를 확인해보자 

