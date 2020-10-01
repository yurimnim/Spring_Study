package com.example.demo.db;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.BoardVo;
import com.example.demo.vo.MemberVo;

public class BoardManager {
	
	public static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "com/example/demo/db/sqlMapConfig.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			System.out.println("static 예외발생 " + e.getMessage());
		}
	}
	
	public static List<BoardVo> listAll(HashMap map) {
		List<BoardVo> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		list = session.selectList("board.selectAll",map);
		session.close();
		return list;
	}
	
	//insert 관련 메소드
	public static int insert(BoardVo b) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.insert("board.insert", b);
		session.close();
		return re;
	}
	
	//글넘버
	public static int getNextNo() {
		int n = -1;
		SqlSession session = sqlSessionFactory.openSession();
		n = session.selectOne("board.getNextNo");
		session.close();
		return n;
	}
	
	//글수 계산
	public static int countTotal() {
		int n = -1;
		SqlSession session = sqlSessionFactory.openSession();
		n = session.selectOne("board.countTotal");
		session.close();
		return n;
	}
	
	//updateStep! 
	public static int updateStep(HashMap map) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession();
		re = session.update("board.updateStep", map);
		session.close();			
		return re;
	}
	
	//디테일!
	public static BoardVo detail(int no) {
		BoardVo b = null;
		SqlSession session = sqlSessionFactory.openSession();
		b = session.selectOne("board.detail", no);
		session.close();
		return b;
	}
	
	//업데이트 
	public static int update(BoardVo b) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.insert("board.update", b);
		session.close();
		return re;
	}
	
	//지우기 
	public static int delete(HashMap map) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.delete("board.delete", map);
		session.close();
		return re;
	}
}
