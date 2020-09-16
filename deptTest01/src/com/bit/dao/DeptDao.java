package com.bit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.DeptVo;

public class DeptDao {
	
	public ArrayList<DeptVo> listAll() {
		ArrayList<DeptVo> list = new ArrayList<DeptVo>();
		String sql = "select * from dept";
		try {	
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new DeptVo(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
			ConnectionProvider.close(conn, stmt, rs);		
		} catch (Exception e) {
			System.out.println("listAll 예외발생 " + e.getMessage());
		}		
		return list;
	}
}
