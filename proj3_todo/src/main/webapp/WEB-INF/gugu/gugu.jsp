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
</head>
<body>
	
	<h1>${gugu[0].num1}단</h1>
	
	<%-- <c:forEach var="i구구" begin="0" end="8">
		${gugu[i]}<hr>
	</c:forEach> --%>
	
	<c:forEach var="i" begin="0" end="8">
		${gugu[i].num1} * ${gugu[i].num2} = ${gugu[i].result} <hr>
	</c:forEach>
	<form action="input">
		<input type="submit" value="뒤로가기">
	</form>
	
</body>
</html>