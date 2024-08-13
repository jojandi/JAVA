<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		border-collapse: collapse;
		margin-bottom: 10px;
	}

	thead{
		text-align: center;
		padding: 10px;
	}
	
	td{
		padding: 5px;
		text-align: center;
	}
	
	#title{
		width: 200px;
		text-align: left;
	}
</style>
</head>
<body>
	
	<!-- 조회한 tno에 맞는 상세페이지 -->
	<%-- <div>${dto.tno}</div>
	<div>${dto.title}</div>
	<div>${dto.dueDate}</div>
	<div>${dto.finished}</div> --%>
	<table border=1>
		<thead>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>마감일</td>
				<td>완료 상태</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${dto.tno}</td>
				<td id="title">${dto.title}</td>
				<td>${dto.dueDate}</td>
				<td>${dto.finished}</td>
			</tr>
		</tbody>
	</table>
	
	<form action="http://127.0.0.1:8080/proj3_todo/todo/list">
		<input type="submit" value="뒤로가기">
	</form>
	
</body>
</html>