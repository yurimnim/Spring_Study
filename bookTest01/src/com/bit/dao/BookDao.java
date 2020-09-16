package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BookVo;

public class BookDao {
	
	public int deleteBook(int bookid) {
		int re = -1;
		String sql="delete book where bookid=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,bookid);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt, null);
		} catch (Exception e) {
			System.out.println("deleteBook 예외발생 " + e.getMessage());
		}
		return re;
	}
	
	public int updateBook(BookVo b) {
		int re = -1;
		String sql="update book set bookname=?, publisher=?, price=? where bookid=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,b.getBookname());
			pstmt.setString(2,b.getPublisher());
			pstmt.setInt(3,b.getPrice());
			pstmt.setInt(4,b.getBookid());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt, null);
		} catch (Exception e) {
			System.out.println("updateBook 예외발생 " + e.getMessage());
		}
		return re;
	}
	
	
	public int insertBook(BookVo b) {
		int re = -1;
		String sql="insert into book values(?,?,?,?)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,b.getBookid());
			pstmt.setString(2,b.getBookname());
			pstmt.setString(3,b.getPublisher());
			pstmt.setInt(4,b.getPrice());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt, null);
		} catch (Exception e) {
			System.out.println("insertBook 예외발생 " + e.getMessage());
		}
		return re;
	}
	
	public BookVo getBook(int bookid) {
		BookVo b = null;
		String sql = "select * from book where bookid=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,bookid);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				b = new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			}
			ConnectionProvider.close(conn, pstmt, rs);
		} catch (Exception e) {
			System.out.println("getBook 예외발생 " + e.getMessage());
		}
		return b;
	}
	
	public ArrayList<BookVo> listAll() {
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		String sql = "select * from book order by bookid";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			ConnectionProvider.close(conn, stmt, rs);
		} catch (Exception e) {
			System.out.println("listAll 예외발생 " + e.getMessage());
		}
		return list;
	}
}
