<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<strong>~ \${} 출력하려면 역슬래쉬 붙이기 ~</strong> <br>
	\${ 10 + 1 } : ${ 10 + 1 } <br>
	
	<hr>
	<strong>~ 문자를 숫자로 바꾸어 계산 ~</strong><br>
	\${ "10" + 1 } : ${ "10" + 1 } <br>
<%-- 	\${ "a" + 1 } : ${ "a" + 1 } <br> --%>

	\${ null + 1 } : ${ null + 1 } <br>
	
	\${ 10 / 3 } : ${ 10 / 3 } <br>
	\${ 10 div 3 } : ${ 10 div 3 } <br>

	\${ 10 % 3 } : ${ 10 % 3 } <br>
	\${ 10 mod 3 } : ${ 10 mod 3 } <br>
	
	<hr>
	<strong>~ true와 false는 그저 글씨임 ~</strong> <br>
	\${ 10 == 10 } : ${ 10 == 10 }<br>
	\${ "10" == "10" } : ${ "10" == "10" }<br>
	\${ "10" eq "10" } : ${ "10" eq "10" }<br>
	
	\${ 10 != 10 } : ${ 10 != 10 }<br>
	\${ 10 ne 10 } : ${ 10 ne 10 }<br>

	\${ 100 > 10 } : ${ 100 > 10 }<br>
	\${ 100 gt 10 } : ${ 100 gt 10 }<br>
	
	\${ 100 < 10 } : ${ 100 < 10 }<br>
	\${ 100 lt 10 } : ${ 100 lt 10 }<br>
	
	\${ 100 >= 10 } : ${ 100 >= 10 }<br>
	\${ 100 ge 10 } : ${ 100 ge 10 }<br>
	
	\${ 100 <= 10 } : ${ 100 <= 10 }<br>
	\${ 100 le 10 } : ${ 100 le 10 }<br>

	\${ ( 100 gt 10 ) eq "true" } : ${ ( 100 gt 10 ) eq "true" }<br>
	
	<hr>
	\${ ( 100 gt 10 ) && ( 100 gt 10 ) } : ${ ( 100 gt 10 ) && ( 100 gt 10 ) }<br>
	\${ ( 100 gt 10 ) and ( 100 gt 10 ) } : ${ ( 100 gt 10 ) and ( 100 gt 10 ) }<br>
	
	\${ ( 100 gt 10 ) || ( 100 gt 10 ) } : ${ ( 100 gt 10 ) || ( 100 gt 10 ) }<br>
	\${ ( 100 gt 10 ) or ( 100 gt 10 ) } : ${ ( 100 gt 10 ) or ( 100 gt 10 ) }<br>
	
	\${ !( 100 gt 10 ) } : ${ !( 100 gt 10 ) }<br>
	\${ not( 100 gt 10 ) } : ${ not( 100 gt 10 ) }<br>
	
	<hr>
	<strong>~ 출력할 것이 있다면 false, 없다면 true ~</strong><br>
	\${ empty "변수" } : ${ empty "변수" } <br>
	\${ empty null } : ${ empty null } <br>
	\${ empty "" } : ${ empty "" } <br>
	
	<hr>
	<strong>~ 파라미터에 있는 값 가져오기 ~</strong><br>
	\${param.a} : ${param.a}<br>
	\${paramValues.a[0]} : ${paramValues.a[0]}<br>
	\${paramValues.a[1]} : ${paramValues.a[1]}<br>
	\${paramValues.a[100]} : ${paramValues.a[100]}<br>
</body>
</html>