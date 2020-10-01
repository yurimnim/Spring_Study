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
<form action="insertBoard.do" method="post">
이름&nbsp;&nbsp;:<input type="text" name="name"><br>
ID&nbsp;&nbsp;:<input type="text" name="id"><br>
암호&nbsp;&nbsp;:<input type="password" name="pwd"><br>
휴대전화&nbsp;&nbsp;:<input type="number" name="tel">
<!-- 인증번호&nbsp;&nbsp;:<input type="number" name="passNo"><br> -->
<input type="submit" value="회원가입">
</form> 

</body>
</html>