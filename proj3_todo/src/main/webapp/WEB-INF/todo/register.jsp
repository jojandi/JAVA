<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<form method="post" action="register">
			<div>제목</div>
			<input type="text" name="text" placeholder="할 일을 입력하세요">
			
			<div>마감일</div>
			<input type="date" name="dueDate">
			
			<div>완료상태</div>
			<input type="radio" name="finished" value="N" checked="chedcked"> 미완료
			<input type="radio" name="finished" value="Y"> 완료 <br><br>
			<input type="submit" value="등록하기">
			<a href="list" id="form">
				<input type="button" value="뒤로가기">
			</a>
		</form>
	</div>

</body>
</html>