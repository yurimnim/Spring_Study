<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>고객정보수정</h2>
<hr>
<form action="updateCustomer.do" method="post">
고객아이디 : ${c.custid }<input type="hidden" name="custid" value="${c.custid }"><br>
고객명: <input type="text" name="name" value="${c.name }"><br>
주소: <input type="text" name="address" value="${c.address }"><br>
전화번호: <input type="text" name="phone" value="${c.phone }"><br>
<br>
<input type="submit" value="수정">
</form>
<br>
<br>
<a href="listCustomer.do"><b>목록으로</b> </a>
</body>
</html>