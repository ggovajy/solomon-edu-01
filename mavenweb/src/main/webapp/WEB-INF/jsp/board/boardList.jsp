<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Board List</h1>
	<table border="1">
	<thead>
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>제목</th>
		<th>조회</th>
		<th>작성일</th>
	</tr>
	</thead>
	<tbody>
		<c:forEach var="item" items="${list}">
		<tr>
			<td><c:out value="${item.num}" /></td>
			<td><c:out value="${item.name}" /></td>
			<td><c:out value="${item.title}" /></td>
			<td><c:out value="${item.readCount}" /></td>
			<td><c:out value="${item.writeDate}" /></td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>
