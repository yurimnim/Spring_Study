<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>도서 상세정보</h2>
<hr>
도서ID: ${b.bookid }<br>
도서명 : ${b.bookname }<br>
출판사 : ${b.publisher }<br>
도서가격: ${b.price }원<br> 
<br>
&nbsp;<a href="updateBook.do?bookid=${b.bookid }">수정</a>&nbsp; |&nbsp;<a href="deleteBook.do?bookid=${b.bookid }">삭제</a>&nbsp;| &nbsp;<a href="insertBook.do">새등록</a>&nbsp; | &nbsp;<a href="listBook.do">목록</a>&nbsp;

</body>
</html>