package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.CustomerVo;

public class CustomerDao {
	
	public int delete(int custid) {
		int re = -1;
		String sql= "delete customer where custid=?";	
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt, null);
		} catch (Exception e) {
			System.out.println("delete예외발생 "+ e.getMessage());
		}
		return re;
	}
	
	public int update(CustomerVo c) {
		int re = -1;
		String sql= "update customer set name=?, address=?, phone=? where custid=?";	
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getName());
			pstmt.setString(2, c.getAddress());
			pstmt.setString(3, c.getPhone());
			pstmt.setInt(4, c.getCustid());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt, null);
		} catch (Exception e) {
			System.out.println("update예외발생 "+ e.getMessage());
		}
		return re;
	}
	
	public int insert(CustomerVo c) {
		int re = -1;
		String sql= "insert into customer values(?,?,?,?)";	
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getCustid());
			pstmt.setString(2, c.getName());
			pstmt.setString(3, c.getAddress());
			pstmt.setString(4, c.getPhone());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt, null);
		} catch (Exception e) {
			System.out.println("insert예외발생 "+ e.getMessage());
		}
		return re;
	}
	
	public CustomerVo getCustomer(int custid){
		CustomerVo c = null;
		String sql="select * from customer where custid=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				c = new CustomerVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
			ConnectionProvider.close(conn, pstmt, rs);
		} catch (Exception e) {
			System.out.println("getCustomer 예외발생 " + e.getMessage());
		}
		return c;
	}
	
	public ArrayList<CustomerVo> listAll(){
		ArrayList<CustomerVo> list = new ArrayList<CustomerVo>();
		String sql="select * from customer";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new CustomerVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			ConnectionProvider.close(conn, stmt, rs);
		} catch (Exception e) {
			System.out.println("listAll 예외발생 " + e.getMessage());
		}
		return list;
	}

}
