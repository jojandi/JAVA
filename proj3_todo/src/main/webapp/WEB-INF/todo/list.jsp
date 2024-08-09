<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		table{
			border-collapse: collapse;
		}

		thead{
			text-align: center;
			padding: 10px;
		}
		
		td{
			padding: 5px;
		}
		
		#title{
			width: 200px;
		}
		#due{
			width: 100px;
			text-align: center;
		}
		
	</style>
</head>
<body>

	<h1>ToDoList</h1>

	<table border=1>
		<thead>
			<tr>
				<td><input type="checkbox"></td>
				<td>제목</td>
				<td>마감일</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="i" begin="0" end="9" varStatus="loop">
				<tr>
					<td>
						<c:if test="${list[i].finished == false}">
							<input type="checkbox">
						</c:if>
						<c:if test="${list[i].finished == true}">
							<input type="checkbox" checked="checked">
						</c:if>
					</td>
					<td id="title">
						${list[i].title}
					</td>
					<td id="due">
						${list[i].dueDate}
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	
</body>
</html>