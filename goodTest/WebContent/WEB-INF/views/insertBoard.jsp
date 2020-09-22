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
<form action="insertBoard.do" method="post" enctype="multipart/form-data">
	제목&nbsp;&nbsp;:<input type="text" name="title"><br>
	작성자&nbsp;:<input type="text" name="writer"><br>
	내용:<br>
	<textarea rows="15" cols="25" name="content">
	</textarea><br>
	파일:<input type="file" name="uploadFile"><br>
	암호&nbsp;&nbsp;:<input type="password" name="pwd"><br>
	<input type="submit" value="등록">
	<input type="reset" value="취소">
</form>

</body>
</html>