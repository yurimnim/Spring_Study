package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.BoardDao;
import com.example.demo.vo.BoardVo;

@Controller

public class BoardController {
	
	@Autowired
	private BoardDao dao;
	public static int countTOTAL;
	public static int pageSIZE=10;
	public static int totalPAGE=0;	

	public void setDao(BoardDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listBoard.do")
	public ModelAndView listAll(@RequestParam(value="pageNUM", defaultValue="1") int pageNUM) {
		countTOTAL = dao.countTotal();
		totalPAGE = (int)Math.ceil((double)totalPAGE/pageSIZE);
		int start = (pageNUM-1)*pageSIZE + 1;
		int end = start + pageSIZE;
		if(end > countTOTAL) {
			end = countTOTAL;
		}
		
		HashMap map = new HashMap();
		map.put("start",start);
		map.put("end",end);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll(map));
		mav.addObject("totalPage", countTOTAL);
		return mav;
	}
	
	@RequestMapping("/detailBoard.do")
	public ModelAndView detail(int no) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("b", dao.detail(no));
		return mav;
	}
	
}
