<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${title }</h2>
<hr>
고객아이디: ${ct.custid } <br>
고객명 : ${ct.name } <br>
고객주소: ${ct.address } <br>
연락처 : ${ct.phone } <br>
<a href="updateCustomer.do?custid=${ct.custid }">수정</a>| <a href="deleteCustomer.do?custid=${ct.custid }">삭제</a>
</body>
</html>