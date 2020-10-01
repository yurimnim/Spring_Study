package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.db.GoodsManager;
import com.example.demo.vo.GoodsVo;

@Repository
public class GoodsDao {
	
	public List<GoodsVo> listAll() {
		return GoodsManager.listAll();
	}
	
	public int insert(GoodsVo g) {
		return GoodsManager.insert(g);
	}
	
	public int update(GoodsVo g) {
		return GoodsManager.update(g);
	}

	public GoodsVo detail(int no) {
		return GoodsManager.detail(no);
	}
	
	public int delete(int no) {
		return GoodsManager.delete(no);
	}
}
