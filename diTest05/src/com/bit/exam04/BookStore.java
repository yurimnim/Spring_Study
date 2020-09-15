package com.bit.exam04;

public class BookStore {
	private BookDao bDao;
	private CustomerDao cDao;
	
	public void setbDao(BookDao bDao) {
		this.bDao = bDao;
	}
	
	public void setcDao(CustomerDao cDao) {
		this.cDao = cDao;
	}
	
	public void service() {
		bDao.insert();
		cDao.insert();
	}
}
