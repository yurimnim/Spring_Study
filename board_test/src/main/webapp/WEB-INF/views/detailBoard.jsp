<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${b.title }</h2>
작성자:&nbsp;${b.title }<br>
작성일:&nbsp;${b.regdate}<br>
조회수:&nbsp;${b.hit}<br>
ip:&nbsp;${b.ip}<br>
<hr>
<textarea rows="10" cols="30" readonly="readonly">
${b.content }
</textarea>
<br><br>
<img src="image/${fname }">
<br><br>
&nbsp;<a href="updateBoard.do?no=${b.no }">수정</a>&nbsp;|&nbsp;<a href="deleteBoard.do?no=${b.no }">삭제</a>&nbsp;
|&nbsp;<a href="insertBoard.do?no=${b.no }">새등록</a>&nbsp;|&nbsp;<a href="listBoard.do">목록</a>&nbsp;
</body>
</html>