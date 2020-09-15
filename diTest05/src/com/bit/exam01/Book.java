package com.bit.exam01;

public class Book {
	private int bno;
	private String bookname;
	private String publisher;
	private int price;
	
	public Book(int bno, String bookname, String publisher, int price) {
		super();
		this.bno = bno;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void info() {
		System.out.println("Booknumber: " + bno);
		System.out.println("bookname: " + bookname);
		System.out.println("publisher: " + publisher);
		System.out.println("price: " + price);
	}
}
