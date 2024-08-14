<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo 등록 | Todo 관리</title>
<style>
	body{ padding: 20px; margin: 0; }
	div{ margin: 15px 0 5px 0; }
	#form{ display: inline-block; }
</style>
</head>
<body>
	<div>
		<form method="post" action="update">
			<input type="hidden" name="tno" value="${dto.tno}">
			<div>제목</div>
			<input type="text" name="text" value="${dto.title}">
			
			<div>마감일</div>
			<input type="date" name="dueDate" value="${dto.dueDate}">
			
			<div>완료상태</div>
			<c:if test="${dto.finished == false}">
				<input type="radio" name="finished" value="N" checked="checked"> 미완료
				<input type="radio" name="finished" value="Y"> 완료<br><br>
			</c:if>
			<c:if test="${dto.finished == true}">
				<input type="radio" name="finished" value="N"> 미완료
				<input type="radio" name="finished" value="Y" checked="checked"> 완료<br><br>
			</c:if>
			
			<input type="submit" value="수정하기">
			<a href="list" id="form">
				<input type="button" value="뒤로가기">
			</a>
		</form>
	</div>

</body>
</html>