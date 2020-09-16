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
<table border="1" width="50%">
	<tr>
		<th>고객번호</th>
		<th>고객명</th>
	</tr>
<c:forEach var="m" items="${list }">
	<tr>
		<td>${m.custid }</td>
		<td><a href="detailCustomer.do?custid=${m.custid }">${m.name }</a></td>
	</tr>
</c:forEach>
</table>
<br>
<a href="insertCustomer.do">고객등록</a>
</body>
</html>