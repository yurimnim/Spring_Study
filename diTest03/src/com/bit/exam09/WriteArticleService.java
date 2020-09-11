package com.bit.exam09;

public class WriteArticleService {
	private ArticleDao dao;

	public void setDao(ArticleDao dao) {
		this.dao = dao;
	}	
	
	public void service() {
		dao.insert();
	}
}
