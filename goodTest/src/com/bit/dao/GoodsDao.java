package com.bit.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.bit.db.GoodsManager;
import com.bit.vo.GoodsVo;

@Repository
public class GoodsDao {
	
	public List<GoodsVo> findAll() {
		return GoodsManager.findAll();
	}
	
	public GoodsVo detail(int no) {
		return GoodsManager.detail(no);
	}
	
	public int insert(GoodsVo g) {
		return GoodsManager.insert(g);
	}
	
	public int update(GoodsVo g) {
		return GoodsManager.update(g);
	}
	
	public int delete(int no) {
		return GoodsManager.delete(no);
	}
}
