<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>상품수정</h2>
<hr>
<form action="updateGoods.do" method="post">
상품번호:<input type="hidden" name="no" value="${g.no}"> ${g.no }<br>
상품명:<input type="text" name="name" value="${g.name}"><br>
상품가격:<input type="number" name="price" value="${g.price}"><br>
재고수량:<input type="number" name="qty" value="${g.qty}"><br>
이미지수정:<input type="file" name="uploadFile" value="${g.fname}"><br>
<input type="submit" value="수정"><br>
</form>
<br>
&nbsp;<a href="listGoods.do">목록</a>&nbsp;|&nbsp;<a href="insertGoods.do">새등록</a>
</body>
</html>