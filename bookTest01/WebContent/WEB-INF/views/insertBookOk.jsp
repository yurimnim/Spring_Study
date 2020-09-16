<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${re==1 }">
		도서등록완료
	</c:if>
	<c:if test="${re!=1 }">
		도서등록오류
	</c:if>
	<hr>
	<a href="listBook.do">목록</a><br>
	<a href="insertBook.do">책 등록하러가기</a>
</body>
</html>