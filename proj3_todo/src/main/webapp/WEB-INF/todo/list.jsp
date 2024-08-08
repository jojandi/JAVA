<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>List Page</h1>
	
	${list}
	<hr>
	<!-- 첫번째 리스트만 가져오기 -->
	${list[0]} 
	
	<hr>
	<!-- title만 가져오기 -> getter 실행 -->
	${list[0].title} 

	<hr>
	123${null}456

</body>
</html>