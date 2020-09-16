<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>고객등록</h2>
<hr>
<form action="insertCustomer.do" method="post">
고객아이디 : <input type="number" name="custid"><br>
고객명: <input type="text" name="name"><br>
주소: <input type="text" name="address"><br>
전화번호: <input type="text" name="phone"><br>
<br>
<input type="submit" value="등록">
</form>
<br>
<br>
<a href="listCustomer.do"><b>목록으로</b> </a>
</body>
</html>