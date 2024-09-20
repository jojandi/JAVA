<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{ width: 400px; border: 1px #a39485 solid; font-size: .9em; border-collapse: collapse; margin: 10px 0;}
	td { border-bottom: 1px solid #ccc; background: #fff; text-align: center; }
	form{ width: 400px; }
	table input { width: 90%; }
</style>
</head>
<body>

<header>
	<nav>emp > 회원수정</nav>
</header>
	<form method="post" action="emp0">
		<table border="1">
			<tr>
				<td>empno</td>
				<td>${dto.empno}</td>
			</tr>
			<tr>
				<td>ename</td>
				<td><input type="text" name="ename" value="${dto.ename}"></td>
			</tr>
			<tr>
				<td>hireDate</td>
				<td><input type="date" name="hireDate" value="${dto.hireDate}"></td>
			</tr>
			
		</table>
		<div style="text-align: center;">
			<input type="hidden" name="empno" value="${dto.empno}">
			<input type="hidden" name="cmd" value="edit">
			<input type="submit" value="수정하기">
		</div>
	</form>

</body>
</html>