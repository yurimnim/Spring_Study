package com.bit.exam07;

public class Book {
	private int no;
	private String bookname;
	private String publisher;
	private int price;

	public void setNo(int no) {
		this.no = no;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void bookInfo() {
		System.out.println(no + " " + bookname + " " + publisher + " " + price + "원");
	}
}
//book 객체를 제공하는 xml을 작성하고 그것을 이용하는 main 을 작성해보자.