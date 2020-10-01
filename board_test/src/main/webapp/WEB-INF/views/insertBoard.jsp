<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시물등록</h2>
<hr> 
<form action="insertBoard.do" method="post"><br>
글제목&nbsp;&nbsp;: <input type="text" name="title"><br>
작성자&nbsp;&nbsp;: <input type="text" name="writer"><br>
비밀번호&nbsp;: <input type="text" name="title"><br>
내용&nbsp;:<br>
<textarea rows="15" cols="60" name="content">
</textarea>
첨부파일&nbsp;:<input type="file" name="uploadFile"><br><br>
<input type="submit" value="등록">
</form>
</body>
</html>