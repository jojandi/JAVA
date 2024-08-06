<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- 
	action의 기본값 : 내 주소
	method의 기본값 : get
 --%>

<form method="post" action="makeResult">
	<input type="number" name="num1">
	<input type="number" name="num2">
	<button type="submit">SEND-post</button>
</form>
<hr>

<form method="get" action="makeResult">
	<input type="text" name="text1" value="text1"><br>
	<input type="button" name="btn1" value="btn1"><br>
	<button type="button" name="btn2" value="btn2">버튼2</button><br>
	<input type="password" name="pw1" value="pw1"><br>
	<input type="hidden" name="hidden1" value="hidden1"><br>
	
	<input type="radio" name="radio1" value="radio2">라디오2<br>
	<input type="radio" name="radio1" value="radio3">라디오3<br>

	<input type="checkbox" name="chk1" value="chk2">체크2<br>
	<input type="checkbox" name="chk1" value="chk3">체크3<br>
	<input type="checkbox" name="chk1" value="chk4">체크4<br>
	
	<input type="date" name="date1"><br>
	
	<input type="text" name="text2" value="text2" style="display:none;"><br>
	
	<select name="select1">
		<option value="op1">옵션1</option>
		<option value="op2">옵션2</option>
		<option value="op3">옵션3</option>
		<option value="op4">옵션4</option>
	</select><br>
	
	<textarea name="textarea1">
		초기값
		엔터
		엔터
	</textarea><br>

	<button type="submit">SEND-get</button>
</form>


</body>
</html>