<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서상세</title>
</head>
<body>
<h2>도서 상세</h2>
<hr>
<h3>도서명: ${b.bookname }</h3>
도서번호: ${b.bookid } <br>
출판사: ${b.publisher } <br>
가격: ${b.price }<br><br>

<a href="listBook.do"><b>목록</b></a>
<a href="updateBook.do?bookid=${b.bookid }"><b>수정</b></a>
<a href="deleteBookOk.do?bookid=${b.bookid }"><b>삭제</b></a>

</body>
</html>