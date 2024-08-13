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
		a:link{
            color: inherit;
            text-decoration: none;
        }

        a:visited{
            color: inherit;
            text-decoration: none;
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
			<c:forEach var="list" items="${list}" varStatus="loop">
				<tr>
					<td>
					<!-- finished가 true라면 checked -->
						<c:if test="${list.finished == false}">
							<input type="checkbox">
						</c:if>
						<c:if test="${list.finished == true}">
							<input type="checkbox" checked="checked">
						</c:if>
					</td>
					
					<!-- 제목 클릭 시 상세 페이지 조회(todo/read로 이동) -->
					<td id="title">
						<c:url var="url" value="/todo/read">
							<c:param name="tno" value="${list.tno}"></c:param>
						</c:url>
						<a href=${url}>${list.title}</a>
					</td>
					
					<td id="due">
						${list.dueDate}
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	
</body>
</html>