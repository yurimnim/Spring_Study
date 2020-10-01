package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.BoardManager;
import com.example.demo.db.MemberManager;
import com.example.demo.vo.BoardVo;
import com.example.demo.vo.MemberVo;

@Repository
public class MemberDao {
	//회원가입
	public int insertMember(MemberVo m) {
		return MemberManager.insertMember(m);
	}
}
