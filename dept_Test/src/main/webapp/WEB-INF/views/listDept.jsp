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
<h2>부서목록</h2>
<hr>
<table border="1" width="60%">
	<tr>
		<th>부서번호</th>
		<th>부서이름</th>
		<th>위치</th>
	</tr>
<c:forEach var="d" items="${list}">
	<tr>
		<td>${d.deptno }</td>
		<td>${d.dname }</td>
		<td>${d.loc }</td>	
	</tr>
</c:forEach>
</table>
</body>
</html>