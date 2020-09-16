<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서수정 페이지</title>
</head>
<body>
<h2>도서수정</h2>
<hr>
<form action="updateBook.do" method="post">
	도서번호: ${b.bookid }<br>
	<input type="hidden" name="bookid" value="${b.bookid }"><br>
	도서명:<input type="text" name="bookname" value="${b.bookname }"><br>
	출판사:<input type="text" name="publisher" value="${b.publisher }"><br>
	도서가격:<input type="number" name="price" value="${b.price }"><br>
	<input type="submit" value="수정">
</form>

</body>
</html>