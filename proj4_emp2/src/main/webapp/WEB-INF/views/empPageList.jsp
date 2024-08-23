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
	#pages{ text-align: center; }
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
				<!-- list가 비어있지 않다면 -->
				<c:if test="${not empty map.list}">
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
				</c:if>
				
				<!-- list가 비어있다면 -->
				<c:if test="${empty map.list}">
					<tr>
						<td colspan="5">자료가 없습니다. </td>
					</tr>
				</c:if>
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
		
		int countPerSection = 5; // 한 번에 보여줄 페이지의 개수
		// 몇 번째 섹션인지 -> 현재페이지 / 한 번에 보여줄 페이지의 개수 -> 올림처리
		int position = (int)Math.ceil((double)pageNo / countPerSection);
		
		int sec_first = ((position - 1) * countPerSection) + 1; // 섹션의 첫 번째 페이지
		int sec_last = position * countPerSection; // 섹션으 마지막 페이지
		
		// 마지막 페이지 이상으로 더이상 페이지가 나오지 않게 설계
		if(sec_last > lastPage){
			sec_last = lastPage;
		}
	%>
	
	<!-- 자바영역의 값 올리기 -->
	<c:set var="lastPage" value="<%= lastPage %>"/>
	
	
	<div id="pages">
		<!-- 섹션의 첫번째 페이지가 1과 같을 때는 이전 이동 불가 -->
		<c:if test="<%= sec_first == 1 %>">
			이전
		</c:if>
		<c:if test="<%= sec_first != 1 %>">
			<a href="page?page=<%= sec_first - 1 %>">이전</a>
		</c:if>
		
<%-- 		<c:forEach var="i" begin="1" end="${lastPage}"> --%>
		<!-- 섹션 내에서의 첫번째 페이지부터 마지막 페이지만 나오게 -->
		<c:forEach var="i" begin="<%= sec_first %>" end="<%= sec_last %>">
		
				<!-- 페이지 이동, 현재 페이지는 strong 처리 -->
				<c:if test="${i eq param.page}"> 
					<a href="page?page=${i}" id="page"><strong>${i}</strong></a>
				</c:if>
				<c:if test="${i != param.page}"> 
					<a href="page?page=${i}" id="page">${i}</a>
				</c:if>
				
		</c:forEach>
		
		<!-- 섹션의 마지막 페이지가 전체의 마지막 페이지와 같을 때는 다음 이동 불가 -->
		<c:if test="<%= sec_last == lastPage %>">
			다음
		</c:if>
		<c:if test="<%= sec_last != lastPage %>">
			<a href="page?page=<%= sec_last + 1 %>">다음</a>
		</c:if>
	</div>
</div>


</body>
</html>