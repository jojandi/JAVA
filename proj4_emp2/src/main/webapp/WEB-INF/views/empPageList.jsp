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
	#table{ height: 350px; }
	td{ padding: 5px 10px; }
	div{ width: 500px; margin-top: 15px; }
	form{ text-align: right; }
	a:link{ color: inherit; text-decoration: none; }
    a:visited{ color: inherit; text-decoration: none; }
    a:hover{ text-decoration: underline; }
    #page{ padding: 5px; border: 1px solid #ccc; text-align: center; margin: 5px; width: 20px; height: 20px; display: inline-block;}
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

	<div id=table>
		<table border=1>
			<thead>
				<tr>
					<td></td>
					<td>사원번호</td>
					<td>이름</td>
					<td>직책</td>
					<td>부서번호</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="emp" items="${map.list}">
					<tr>
						<td>${emp.rnum}</td>
					<!-- 필드명을 가져오는 것이 아닌 getter명을 가져옴 -->
						<td><a href="read?empno=${emp.empno}">${emp.empno}</a></td>
						<td>${emp.ename}</td>
						<td>${emp.job}</td>
						<td>${emp.deptno}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	
	</div>
	
	<%
		Map map = (Map)request.getAttribute("map");
		int totalCount = (int)map.get("totalCount");
		
		String str_countPerPage = (String)request.getAttribute("countPerPage");
		int countPerPage = Integer.parseInt(str_countPerPage);

		String str_pageNo = (String)request.getAttribute("page");
		int pageNo = Integer.parseInt(str_pageNo);
		
		// 마지막 페이지 구하기 -> 전체 페이지수 / 페이지당 개수 -> 올림처리
		int lastPage = (int)Math.ceil((double)totalCount / countPerPage); 
	%>
	
	<!-- 자바영역의 값 올리기 -->
	<c:set var="lastPage" value="<%= lastPage %>"/>
	
	<div>
		<a>이전</a>
		<c:forEach var="i" begin="1" end="${lastPage}">
			<c:forEach var"j" begin="${param.page % 6 eq 1}" end="${param.page % 6 eq 5}">
				<c:if test="${i eq param.page}"> 
					<a href="page?page=${i}" id="page"><strong>${i}</strong></a>
				</c:if>
				<c:if test="${i != param.page}"> 
					<a href="page?page=${i}" id="page">${i}</a>
				</c:if>
			</c:forEach>
		</c:forEach>
		<a>다음</a>
	</div>
</div>


</body>
</html>