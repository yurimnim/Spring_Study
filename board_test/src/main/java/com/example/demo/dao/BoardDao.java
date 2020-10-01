package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.BoardManager;
import com.example.demo.vo.BoardVo;
import com.example.demo.vo.MemberVo;

@Repository
public class BoardDao {

	public List<BoardVo> listAll(HashMap map) {
		return BoardManager.listAll(map);
	}
	
	public BoardVo detail(int no) {
		return BoardManager.detail(no);
	}
	
	public int insert(BoardVo b) {
		return BoardManager.insert(b);
	}
	
	public int update(BoardVo b) {
		return BoardManager.update(b);
	}
	
	public int delete(HashMap map) {
		return BoardManager.delete(map);
	}
	
	public int getNextNo() {
		return BoardManager.getNextNo();
	}
	
	public int updateStep(HashMap map) {
		return BoardManager.updateStep(map);
	}
	
	public int countTotal() {
		return BoardManager.countTotal();
	}

}
