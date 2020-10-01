package com.example.demo.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.GoodsDao;
import com.example.demo.vo.GoodsVo;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsDao dao;
	
	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/listGoods.do")
	public void list(Model model) {
		model.addAttribute("list", dao.listAll());
		model.addAttribute("title", "상품목록");
	}
	
	@RequestMapping("/detailGoods.do")
	public void detail(int no, Model model) {
		model.addAttribute("g", dao.detail(no));
	}
	
	@RequestMapping("/deleteGoods.do")
	public ModelAndView delete(int no, HttpServletRequest request)  {
			ModelAndView mav = new ModelAndView("redirect:/listGoods.do");
			String path = request.getRealPath("image");
			String oldFname = dao.detail(no).getFname();
			int re = dao.delete(no);
			if(re <= 0) {
				mav.addObject("msg", "삭제오류");
				mav.setViewName("error");
			} else {
				File file = new File(path + "/" +oldFname);
				file.delete();
			}
			return mav;
		}
	
}
