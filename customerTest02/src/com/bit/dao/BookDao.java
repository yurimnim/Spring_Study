package com.bit.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.db.BookManager;
import com.bit.vo.BookVo;

@Repository
public class BookDao {
	
	public List<BookVo> listAll(HashMap map) {
		return BookManager.listAll(map);
	}
	
	public BookVo detail(int bookid) {
		return BookManager.detail(bookid);
	}
	
	public int insert(BookVo b) {
		return BookManager.insert(b);
	}
	
	public int update(BookVo b) {
		return BookManager.update(b);
	}
	
	public int delete(int bookid) {
		return BookManager.delete(bookid);
	}
}
