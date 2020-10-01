package com.example.demo.db;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.EmpVo;

public class EmpManager {
	
public static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "com/example/demo/db/sqlMapConfig.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			System.out.println("empManager static 예외발생 "+ e.getMessage());
		}
	}
	
	public static List<EmpVo> listAll() {
		List<EmpVo> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		list = session.selectList("emp.selectAll");
		return list;
	}
	
	public static EmpVo detail(int no) {
		EmpVo e = null;
		SqlSession session = sqlSessionFactory.openSession();
		e = session.selectOne("emp.detail", no);
		return e;
	}
	
}
