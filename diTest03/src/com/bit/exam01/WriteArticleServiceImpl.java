package com.bit.exam01;

public class WriteArticleServiceImpl {
	private ArticleDao dao;

	public void setDao(ArticleDao dao) {
		this.dao = dao;
	}
	
	public void service() {
		dao.insert();
	}

}
