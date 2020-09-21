package com.bit.db;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.BookVo;
import com.bit.vo.CustomerVo;

public class BookManager {
	public static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			String resource = "com/bit/db/sqlMapConfig.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			System.out.println("BookManager 예외발생 " + e.getMessage());
		}		
	}
	
	public static List<BookVo> listAll(HashMap map) {
		List<BookVo> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		list = session.selectList("book.listAll",map);
		session.close();
		return list;
	}
	
	public static BookVo detail(int bookid) {
		BookVo b = null;
		SqlSession session = sqlSessionFactory.openSession();
		b = session.selectOne("book.detail", bookid);
		session.close();
		return b;	
	}
	
	public static int insert(BookVo b) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.insert("book.insert", b);
		session.close();
		return re;	
	}
	
	public static int update(BookVo b) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.insert("book.update", b);
		session.close();
		return re;	
	}
	
	public static int delete(int bookid) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.insert("book.delete", bookid);
		session.close();
		return re;	
	}
}


