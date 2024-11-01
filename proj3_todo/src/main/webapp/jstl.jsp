<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

!${a3}!<br>
!${a4}!<br>

<c:set var="id" value="idid" scope="page"></c:set> 
${id}<br>

<% int a = 10; %>
<c:set var="a1" value="<%= a %>" scope="page"/> 
${a1}<br>
<c:set var="a2" value="${id}" scope="page"/> 
${a2}<br>

<c:set var="a3" value="로그인"/> 

<c:set var="a4" value="로그인" scope="session"/> 
<%
	System.out.println(pageContext.getAttribute("a1"));
	System.out.println(session.getAttribute("a4"));
%>

<hr>
<c:set var="game" value="메이플" scope="page"/> 
<c:set var="game" value="로아" scope="request"/> 
<c:set var="game" value="메탈슬러그" scope="session"/> 
<c:set var="game" value="블루아카" scope="application"/> 

game : ${game}<br>
game : ${pageScope.game}<br>
game : ${requestScope.game}<br>
game : ${sessionScope.game}<br>
game : ${applicationScope.game}<br>

<hr>
<c:if test="true">
	<strong>항상 참</strong><br>
</c:if>

<c:if test="${id eq 'idid'}">
	관리자입니다. <br>
</c:if>
<c:if test="${id ne 'idid'}">
	관리자가 아닙니다. <br>
</c:if>

<c:choose>
	<c:when test="${empty id}">
		id는 필수입니다.
	</c:when>
	<c:when test="${id == 'id3'}">
		id는 필수입니다.
	</c:when>
	<c:otherwise>
		당신의 id는 ${id}입니다.
	</c:otherwise>
</c:choose>

<hr>
<%
	List list = new ArrayList();

	for(int i = 0; i < 4; i++){
		Map map = new HashMap();
		map.put("plan1","알바" + i);
		map.put("plan2","뒤풀이" + i);
		map.put("plan3","잠자기" + i);
		
		list.add(map);
	}
%>
<!-- list는 java 변수라서 EL 태그에서 쓸 수 없음 -> c:set을 통해 scope에 올리기 -->
<c:set var="list2" value="<%= list %>" scope="page"/>

<c:forEach var="dinner" items="${list2}">
	plan1 : ${dinner.plan1 }<br>
	plan2 : ${dinner.plan2 }<br>
	plan3 : ${dinner.plan3 }<br>
	<br>
</c:forEach>

<hr>
<c:forEach var="i" begin="0" end="3">
	i : ${i}
	<br>
</c:forEach>

<hr>
<c:forEach var="i" begin="0" end="10" step="3" >
	i : ${i}
	<br>
</c:forEach>

<hr>
<c:forEach var="i" begin="0" end="10" step="3"  varStatus="loop">
	i : ${i}
	<c:if test="${not loop.last}">
	,
	</c:if>
	<br>
	실제 i 값 loop.index : ${loop.index}<br>
	카운트 값 loop.count : ${loop.count}<br>
	첫번째면 true loop.first : ${loop.first}<br>
	마지막이면 true loop.last : ${loop.last}<br>
</c:forEach>

<hr>
end가 items의 개수보다 크면 끝까지 나오고 에러 없음<br>
<c:forEach var="dinner" items="${list2}" begin="0" end="2">
	${dinner}<br>
</c:forEach>

<hr>
<a href="https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=검색" target="_blank">네이버</a>
<br>
<a href="http://127.0.0.1:8080/proj3_todo/jstl.jsp">jstl 페이지로 이동</a>
<br>
<a href="/proj3_todo/jstl.jsp">jstl 페이지로 이동</a>
<br>
<h1>
	c:url 사용 이유
</h1>
1. 영어나 숫자 외 한글이나 특수문자를 encode 해줌 <br>
2. context path 자동 추가 (ex. proj3_todo) <br>
3. 쿠키 금지일 때 ;JSESSIONID= 를 자동으로 붙여줌 <br>
<c:url var="url1" value="/jstl.jsp">
	<c:param name="a" value="한글"></c:param>
</c:url>
<a href="${url1}">jstl로 이동</a><br>

pram.name : ${param.name}<br>
c:out : <c:out value="${param.name}"></c:out><br>
c:out : 특수문자를 치환해서 문자 그 자체로 출력하게 해줌
<!-- 
< : &lt;
> : &gl;
& : &amp;
"" 공백 : &nbsp;
 -->

</body>
</html>