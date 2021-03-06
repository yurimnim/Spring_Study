package com.bit.db;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.CustomerVo;

public class CustomerManager {
	public static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			String resource = "com/bit/db/sqlMapConfig.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			 System.out.println("static 동작");
		} catch (Exception e) {
			System.out.println("CustomerManager 예외발생 " + e.getMessage());
		}
	}
	
	public static List<CustomerVo> listAll() {
		List<CustomerVo> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		list = session.selectList("customer.selectAll");
		session.close();
		return list;
	}
	
	public static CustomerVo detailCustomer(int custid) {
		CustomerVo c = null;
		SqlSession session = sqlSessionFactory.openSession();
		c = session.selectOne("customer.selectById", custid);
		session.close();
		return c;
	}
	
	public static int insertCustomer(CustomerVo c) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.insert("customer.insert", c);	
		session.close();
		return re;
	}
	
	public static int updateCustomer(CustomerVo c) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.update("customer.update", c);	
		session.close();
		return re;
	}
	
	public static int deleteCustomer(int custid) {
		int re = -1;
		SqlSession session = sqlSessionFactory.openSession(true);
		re = session.delete("customer.delete", custid);
		session.close();
		return re;
	}
}


