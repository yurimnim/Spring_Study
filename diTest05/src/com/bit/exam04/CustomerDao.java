package com.bit.exam04;

public class CustomerDao {
	
	private Customer customer;

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void insert() {
		customer.info();
		System.out.println("고객을 등록하였습니다.");
	}

}
