package com.bit.exam09;

public class Book {
	private int no;
	private String bookname;
	private String publisher;
	private int price;
	
	public Book(int no, String bookname, String publisher, int price) {
		super();
		this.no = no;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void info() {
		System.out.println("도서번호: " +no + "도서명: " + bookname + "출판사: " + publisher + "가격: " + price);
	}
}
