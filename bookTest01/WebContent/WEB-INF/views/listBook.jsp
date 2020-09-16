<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서목록</title>
</head>
<body>
<h2>${title }</h2>
<hr>
<table border="1" width="50%">
	<tr>
		<th>도서번호</th>
		<th>도서명</th>
	</tr>
<c:forEach var="b" items="${list }">
	<tr>
		<td>${b.bookid }</td>
		<td><a href="detailBook.do?bookid=${b.bookid }">${b.bookname }</a></td>
	</tr>
</c:forEach>		
</table><br>
<a href="insertBook.do">책 등록하러가기</a>
</body>
</html>