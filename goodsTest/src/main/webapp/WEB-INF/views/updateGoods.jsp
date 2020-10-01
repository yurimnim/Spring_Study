<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>상품수정페이지</h2>
<hr>
<form action="updateGoods.do" method="post" enctype="multipart/form-data">
		상품번호:<input type="hidden" name="no" value="${g.no }">${g.no }<br>
		상품이름:<input type="text" name="name" value="${g.name }"><br>
		상품가격:<input type="number" name="price" value="${g.price }"><br>
		상품재고:<input type="number" name="qty" value="${g.qty }"><br>
		이미지파일:<br>
			<img  src="image/${g.fname }" width="30" height="30"><br>
			<input type="hidden" name="fname" value="${g.fname }">
			<input type="file" name="uploadFile"><br>
			<br>
			<input type="submit" value="수정">
	</form>
</body>
</html>