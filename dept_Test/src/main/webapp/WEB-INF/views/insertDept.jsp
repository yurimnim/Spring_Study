<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>부서등록</h2>
<hr>
<form action="insertDept.do" method="post">
부서번호:<input type="number" name="deptno"><br>
부서명:<input type="text" name="dname"><br>
위치:<input type="text" name="loc"><br>
<input type="submit" value="등록"><br>

</form>
</body>
</html>