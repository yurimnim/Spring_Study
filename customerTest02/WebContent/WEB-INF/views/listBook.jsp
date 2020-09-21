<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<style>
	body {
	 	font-family: 'Noto Sans KR';
	}
	
	a {
		text-decoration: none;
	  	color: green;
	}
	
	#op {
		visibility: hidden;
		display: none;		
	}
</style>

<script>
	function pro(v) {	
		var op = document.getElementById("op");
			if(v == "price") {
				op.style.visibility="visible";
				op.style.display="inline";
			} else {
				op.style.visibility="hidden";
				op.style.display="none";
			}
	}
</script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>도서목록</h2>
<hr>
<form action="listBook.do">
<select name="category" onchange="pro(this.value)">
	<option value="publisher">출판사</option>
	<option value="bookname">도서명</option>
	<option value="price">가격</option>
</select>
<select id="op" name="op">
	<option>&gt;</option>
	<option>&lt;</option>
	<option>&gt;=</option>
	<option>&lt;=</option>
	<option>=</option>
</select>

 <input type="search" name="search"><input type="submit" value="검색">
</form>

<table border="1" width="60%">
	<tr>	
		<th><a href="listBook.do?sort=bookid">도서번호</a></th>
		<th><a href="listBook.do?sort=bookname">도서명</a> </th>
		<th><a href="listBook.do?sort=price">가격</a> </th>
	</tr>
	
<c:forEach var="b" items="${list}">	
	<tr>
		<td>${b.bookid }</td>
		<td><a href="detailBook.do?bookid=${b.bookid }">${b.bookname }</a></td>
		<td>${b.price }</td>
	</tr>
</c:forEach>
</table>
<br>
<a href="insertBook.do">도서등록</a>
</body>
</html>