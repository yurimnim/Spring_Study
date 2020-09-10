package com.bit.exam06;

public class Book {
	private int no;
	private String bookname;
	private String publisher;
	private int price;
	
	public Book(int no, String bookname, String publisher, int price) {
		this.no = no;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void bookInfo() {
		System.out.println(no + " " + bookname + " " + publisher + " " + price + "원");
	}
}
//book 객체를 제공하는 xml을 작성하고 그것을 이용하는 main 을 작성해보자.