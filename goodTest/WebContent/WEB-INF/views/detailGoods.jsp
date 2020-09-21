<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>상품상세</h2>
<hr>
상품번호:&nbsp;${d.no } <br>
상품명:&nbsp;${d.name } <br>
상품가격:&nbsp;${d.price } <br>
재고:&nbsp;${d.qty } <br>
<img alt="imageGoods" src="./image/${d.fname }"> <br>
<br>
&nbsp;<a href="listGoods.do">목록</a>&nbsp;|&nbsp;<a href="updateGoods.do?no=${d.no}">수정</a>&nbsp;|
&nbsp;<a href="insertGoods.do">새등록</a>&nbsp;|&nbsp;<a href="deleteGoods.do?no=${d.no}">삭제</a>&nbsp;

</body>
</html>