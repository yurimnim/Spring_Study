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
<br>
<h3>${b.title }</h3>
<b>작성자:</b>&nbsp; ${b.writer }<br>
<b>게시일:</b>&nbsp; ${b.regdate }<br>
<b>조회수:</b>&nbsp; ${b.hit }<br>
<hr>
<textarea rows="20" cols="60" readonly="readonly">
${b.content }
</textarea><br>
첨부파일: ${b.fname }
<c:if test="${b.fname!=''}">
	<img alt="${b.fname }" src="./board_upload/${b.fname }"><br>
</c:if>
&nbsp;답글달기&nbsp;|&nbsp;<a href="updateBoard.do?no=${b.no }">수정</a>&nbsp;
|&nbsp;<a href="deleteBoard.do">삭제</a>&nbsp;
|&nbsp;<a href="insertBoard.do">새글등록</a>&nbsp;
|&nbsp;<a href="listBoard.do">목록</a>&nbsp;
</body>
</html>