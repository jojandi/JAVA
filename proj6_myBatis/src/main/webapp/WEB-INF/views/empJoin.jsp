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
	table{ width: 400px; border: 1px #a39485 solid; font-size: .9em; border-collapse: collapse; margin: 10px 0;}
	td { border-bottom: 1px solid #ccc; background: #fff; text-align: center; }
	form{ width: 400px; }
	table input { width: 90%; }
</style>
</head>
<body>

<header>
	<c:if test='${cmd == "join"}'>
		<nav>emp &gt; 회원 가입</nav>
	</c:if>
	<c:if test='${cmd == "edit"}'>
		<nav>emp &gt; 회원 수정</nav>
	</c:if>
</header>
	<form method="post" action="emp0">
		<table border="1">
			<tr>
				<td>empno</td>
				<td>
					<c:if test='${cmd == "join"}'>
						<input type="text" name="empno">
					</c:if>
					<c:if test='${cmd == "edit"}'>
						${dto.empno}
					</c:if>
				</td>
			</tr>
			<tr>
				<td>ename</td>
				<td>
					<c:if test='${cmd == "join"}'>
						<input type="text" name="ename">
					</c:if>
					<c:if test='${cmd == "edit"}'>
						<input type="text" name="ename" value="${dto.ename}">
					</c:if>
				</td>
			</tr>
			<tr>
				<td>hireDate</td>
				<td>
					<c:if test='${cmd == "join"}'>
						<input type="date" name="hireDate">
					</c:if>
					<c:if test='${cmd == "edit"}'>
						<input type="date" name="hireDate" value="${dto.hireDate}">
					</c:if>
				</td>
			</tr>
			
		</table>
		<div style="text-align: center;">
			<c:if test='${cmd == "join"}'>
				<input type="submit" value="가입하기">
			</c:if>
			<c:if test='${cmd == "edit"}'>
				<input type="hidden" name="empno" value="${dto.empno}">
				<input type="hidden" name="cmd" value="edit">
				<input type="submit" value="수정하기">
			</c:if>
			<a href="emp0"><input type="button" value="목록으로"></a>
		</div>
	</form>

</body>
</html>