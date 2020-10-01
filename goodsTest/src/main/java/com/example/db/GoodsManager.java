package com.example.db;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.GoodsVo;

public class GoodsManager {
	
	public static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "com/example/db/sqlMapConfig.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			System.out.println("static 예외발생: "+e.getMessage());
		}
	}
	
	public static List<GoodsVo> listAll() {
		List<GoodsVo> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		list = session.selectList("goods.selectAll");
		session.close();
		return list;
	}
	
	public static int insert(GoodsVo g) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.insert("goods.insert",g);
		session.close();
		return re;
	}
	
	public static int update(GoodsVo g) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.insert("goods.update",g);
		session.close();
		return re;
	}
	
	public static GoodsVo detail(int no) {
		GoodsVo g = null;
		SqlSession session = sqlSessionFactory.openSession();
		g = session.selectOne("goods.detail",no);
		session.close();
		return g;
	}
	
	public static int delete(int no) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.delete("goods.delete",no);
		session.close();
		return re;
	}
	
	
}
