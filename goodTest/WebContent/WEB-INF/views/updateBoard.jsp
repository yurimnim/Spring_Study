<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시글 등록</h2>
<hr> 
<form action="updateBoard.do" method="post">
	<input type="hidden" name="no" value="${b.no}">
	제목&nbsp;&nbsp;:<input type="text" name="title" value="${b.title}"><br>
	작성자&nbsp;:<input type="text" name="writer" value="${b.writer}"><br>
	내용:<br>
	<textarea rows="10" cols="30" name="content" value="${b.content}">
	</textarea><br>
	암호&nbsp;&nbsp;:<input type="password" name="pwd"><br>
	
	<input type="submit" value="등록">
	<input type="reset" value="취소">
</form>

</body>
</html>