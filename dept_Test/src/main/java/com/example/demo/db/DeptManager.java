package com.example.demo.db;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.example.demo.vo.DeptVo;


public class DeptManager {
	
public static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "com/example/demo/db/sqlMapConfig.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			System.out.println("deptManager static 예외발생 "+ e.getMessage());
		}
	}

	public static List<DeptVo> listAll() {
		List<DeptVo> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		list = session.selectList("dept.selectAll");
		session.close();
		return list;
	}
	
	public static int insert(DeptVo d) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.insert("dept.insert", d);
		session.close();
		return re;
	}
}
