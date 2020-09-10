package com.bit.exam08;

public class WriteArticleServiceImple {
	private ArticleDao dao;
	
	public WriteArticleServiceImple(ArticleDao dao) {
		this.dao = dao;
	}

	public void pro() {
		dao.insert();
	}
}
