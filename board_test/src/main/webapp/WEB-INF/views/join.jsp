<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원가입 페이지</h2>
<hr>
${msg }<br>
<form action="join.do" method="post">
휴대전화번호: <input type="tel" name="tel"><br>
<input type="submit" value="인증번호받기">

</form>
</body>
</html>