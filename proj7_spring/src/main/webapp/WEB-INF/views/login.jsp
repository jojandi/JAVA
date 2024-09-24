<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="login5">
		<!-- DTO에 있는 필드와 name명 맞춰주기 -> 자동으로 값을 넣어줌 -->
		아이디 : <input type="text" name="userID"> <br>
		비밀번호 : <input type="text" name="userPW"> <br>
		
		<br>
		<input type="submit" value="login">
	</form>

</body>
</html>