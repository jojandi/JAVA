<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="emp2.dto.EmpDTO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{ border-collapse: collapse; text-align: center; width: 100%; margin-top: 10px; }
	div{ width: 500px; margin-top: 15px; }
	td{ padding: 6px 5px; text-align: left; }
	form{ text-align: right; }
	a:link{ color: inherit; text-decoration: none; }
    a:visited{ color: inherit; text-decoration: none; }
    a:hover{ text-decoration: underline; }
    td input{ width: 95%; }
    select{ width: 97%; }
</style>
</head>
<body>

<div>
	<form action="update" method="post">		
		<input type=hidden name="empno" value="${list[0].empno}">
		<a href="get"><input type=button value="목록으로"></a>
		<input type=submit value="수정">
		<table border=1>
			<tr>
				<td>사원번호</td>
				<td>${list[0].empno}</td>
			</tr>
			
			<tr>
				<td>이름</td>
				<td><input type="text" name="ename" value="${list[0].ename}"></td>
			</tr>
			
			<tr>
				<td>직책</td>
				<td><input type="text" name="job" value="${list[0].job}"></td>
			</tr>
			
			<tr>
				<td>상사</td>
				<td><input type="text" name="mgr" value="${list[0].mgr}"></td>
			</tr>
			
			<tr>
				<td>입사일</td>
				<td><input type="date" name="hireDate" value="${list[0].hireDate}"></td>
			</tr>
			
			<tr>
				<td>연봉</td>
				<td><input type="text" name="sal" value="${list[0].sal}"></td>
			</tr>
			
			<tr>
				<td>성과금</td>
				<td><input type="text" name="comm" value="${list[0].comm}"></td>
			</tr>
			
			<tr>
				<td>부서번호</td>
				<td>
					<select name="deptno">
					<c:if test="${list[0].deptno == 10}">
						<option value="10" selected>10</option>
						<option value="20">20</option>
						<option value="30">30</option>
						<option value="40">40</option>
					</c:if>
					<c:if test="${list[0].deptno == 20}">
						<option value="10">10</option>
						<option value="20" selected>20</option>
						<option value="30">30</option>
						<option value="40">40</option>
					</c:if>
					<c:if test="${list[0].deptno == 30}">
						<option value="10">10</option>
						<option value="20">20</option>
						<option value="30" selected>30</option>
						<option value="40">40</option>
					</c:if>
					<c:if test="${list[0].deptno == 40}">
						<option value="10">10</option>
						<option value="20">20</option>
						<option value="30">30</option>
						<option value="40" selected>40</option>
					</c:if>
					</select>
				</td>
			</tr>
		</table>	
	</form>

</div>

</body>
</html>