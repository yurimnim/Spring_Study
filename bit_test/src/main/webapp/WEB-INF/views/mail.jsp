<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>인증번호 전송</h2>
<hr> 
${msg }<br>
<form action="mail.do" method="post">
이메일: <input type="email" name="to"><br>
<input type="submit" value="보내기"> 
</form>
</body>
</html>