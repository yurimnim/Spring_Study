<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>도서등록</h2>
<hr>
<form action="insertBookOk.do" method="post">
	도서번호:<input type="number" name="bookid"><br>
	도서명:<input type="text" name="bookname"><br>
	출판사:<input type="text" name="publisher"><br>
	도서가격:<input type="number" name="price"><br>
	<input type="submit" value="등록">
</form>
</body>
</html>