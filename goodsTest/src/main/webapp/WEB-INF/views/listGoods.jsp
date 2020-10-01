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
<h2>${title }</h2>
<hr>
<table border="1" width="60%">
	<tr>
		<th>상품번호</th>
		<th>상품명</th>
		<th>가격</th>
	</tr>
<c:forEach var="g" items="${list}">
	<tr>
		<td>${g.no }</td>
		<td><a href="detailGoods.do?no=${g.no }">${g.name }</a></td>
		<td>${g.price }</td>
	</tr>
</c:forEach>	
</table>
<br>
<a href="insertGoods.do"><b>상품등록 하러가기</b></a>
<br>
</body>
</html>