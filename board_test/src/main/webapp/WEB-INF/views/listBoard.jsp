<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시판</h2>
<hr>
<table border="1" width="60%">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>글쓴이</th>
		<th>등록일</th>
	</tr>
<c:forEach var="b" items="${list }">
	<tr>
		<td>${b.no }</td>
		<td><a href="detailBoard.do?no=${b.no }">${b.title }</a></td>
		<td>${b.writer }</td>
		<td>${b.regdate }</td>
	</tr>
</c:forEach>	
</table>
<br>
<a href="insertBoard.do">새글등록</a>
<a href="joinBoard.do">회원가입</a>
</body>
</html>