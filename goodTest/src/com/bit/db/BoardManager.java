package com.bit.db;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.BoardVo;

public class BoardManager {
	
public static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "com/bit/db/sqlMapConfig.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			System.out.println("boardsManager static 예외발생 "+ e.getMessage());
		}
	}
	
	//목록
	public static List<BoardVo> listAll() {
		List<BoardVo> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		list = session.selectList("board.selectAll");
		session.close();
		return list;
	}
	
	//상세
	public static BoardVo detail(int no) {
		BoardVo b = null;
		SqlSession session = sqlSessionFactory.openSession();
		b = session.selectOne("board.detail", no);
		session.close();
		return b;
	}
	
	//새글등록
	public static int insert(BoardVo b) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.insert("board.insert",b);
		session.close();
		return re;
	}
	
	//글넘버
	public static int getNextNo() {
		int n = 0;
		SqlSession session = sqlSessionFactory.openSession();
		n = session.selectOne("board.nextNo");
		session.close();
		return n;
	}
	
	//업뎃
	public static int update(BoardVo b) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.update("board.update", b);
		session.close();
		return re;
	}
	
	//삭제
		public static int delete(int no) {
			int re = -1;
			SqlSession session = sqlSessionFactory.openSession(true);
			re = session.delete("board.delete", no);
			session.close();
			return re;
		}
}
