package com.bit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.db.BoardManager;
import com.bit.vo.BoardVo;

@Repository
public class BoardDao {
	
	public List<BoardVo> listAll() {
		return BoardManager.listAll();
	}
	
	public BoardVo detail(int no) {
		return BoardManager.detail(no);
	}
	
	public int insert(BoardVo b) {
		return BoardManager.insert(b);
	}
	
	public int getNextNo() {
		return BoardManager.getNextNo();
	}
	
	public int update(BoardVo b) {
		return BoardManager.update(b);
	}
	
	public int delete(int no) {
		return BoardManager.delete(no);
	}
}
