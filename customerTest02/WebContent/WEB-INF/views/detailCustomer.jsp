<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>고객정보</h2>
<hr>
고객아이디: ${c.custid }<br>
고객명: ${c.name } <br>
주소: ${c.address } <br>
전화번호:${c.phone } <br>
<br>
<a href="listCustomer.do">목록</a> | <a href="deleteCustomer.do?custid=${c.custid }">삭제</a> | <a href="updateCustomer.do?custid=${c.custid }">수정</a> | <a href="insertCustomer.do">새등록 </a>

</body>
</html>