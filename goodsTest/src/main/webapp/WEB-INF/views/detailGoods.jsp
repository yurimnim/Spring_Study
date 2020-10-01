<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${g.name }</h2>
<hr>
<img src="image/${g.fname }"><br><br>
상품번호: ${g.no }<br>
가격: ${g.price }<br>
수량: ${g.qty }<br>
<br>
&nbsp;<a href="updateGoods.do?no=${g.no }">수정</a>&nbsp;| 
&nbsp;<a href="deleteGoods.do?no=${g.no }">삭제</a>&nbsp;|
&nbsp;<a href="listGoods.do">목록</a>&nbsp;|
&nbsp;<a href="insertGoods.do">새등록</a>&nbsp;
</body>
</html>