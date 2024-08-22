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
	td{ padding: 5px 10px; }
	div{ width: 500px; margin-top: 15px; }
	form{ text-align: right; }
	a:link{ color: inherit; text-decoration: none; }
    a:visited{ color: inherit; text-decoration: none; }
    a:hover{ text-decoration: underline; }
</style>
</head>
<body>

<div>
	<form action="insert">
			<input type="submit" value="등록" id=insert>
	</form>
	<form>
		<input type=text name=empno placeholder="사원번호를 입력해주세요" value="${param.empno}">
		<input type=text name=ename placeholder="이름을 입력해주세요" value="${param.ename}">
		<input type=submit value="검색">
	</form>

	<table border=1>
		<thead>
			<tr>
				<td>사원번호</td>
				<td>이름</td>
				<td>직책</td>
<!-- 				<td>상사</td> -->
<!-- 				<td>입사일</td> -->
<!-- 				<td>연봉</td> -->
<!-- 				<td>성과금</td> -->
				<td>부서번호</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${list}">
				<tr>
				<!-- 필드명을 가져오는 것이 아닌 getter명을 가져옴 -->
					<td><a href="read?empno=${emp.empno}">${emp.empno}</a></td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
<%-- 					<td>${emp.mgr}</td> --%>
<%-- 					<td>${emp.hireDate}</td> --%>
<%-- 					<td>${emp.sal}</td> --%>
<%-- 					<td>${emp.comm}</td> --%>
					<td>${emp.deptno}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>	
</div>


</body>
</html>