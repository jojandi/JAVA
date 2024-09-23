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
<style>
	table tbody td{ padding: 5px 0; height: 35px; box-sizing: border-box; text-overflow: ellipsis; }
	table{ width: 600px; border: 1px #a39485 solid; font-size: .9em; border-collapse: collapse; margin-top: 10px;}
	th{ text-align: center; border-bottom: 2px solid #ccc; padding: 10px;}
	thead { font-weight: bold; }
	td { border-bottom: 1px solid #ccc; background: #fff; text-align: center; }
	caption{ display: none; }
	#aDiv{ text-align: right; width: 600px; }
	a:link{ color: inherit; text-decoration: none; }
    a:visited{ color: inherit; text-decoration: none; }
</style>
</head>
<body>

<header>
	<nav>emp > 회원 목록</nav>
</header>

<main>
	<div id="aDiv">
		<a href="emp0?cmd=join">
			<input type="button" value="회원가입">
		</a>
	</div>
	<section>
		<article>
			<form id="frm" method="get" action="emp0">
				<select name="searchType">
					<option value="1" ${searchType == 1 or searchType == null ? "selected='selected'" : ""}>이름</option>
					<option value="2" ${searchType == 2 ? "selected='selected'" : ""}>직책</option>
					<option value="3" ${searchType == 3 ? "selected='selected'" : ""}>이름 + 직책</option>
					<option value="4" ${searchType == 4 ? "selected='selected'" : ""}>연봉 (이하)</option>
				</select>
				<input type="text" name="keyword" placeholder="검색어를 입력해주세요. " value="${keyword}">
				<input type="submit" value="검색">
				
				<input type="hidden" name="orderType" value="${orderType}">
				
				<table>
					<caption>회원 목록 표시</caption>
					<colgroup>
						<col width="5%">
						<col width="14%">
						<col width="7%">
						<col width="12%">
						<col width="10%">
						<col width="37%">
						<%-- <col width="8%"> --%>
					</colgroup>
					<thead>
						<tr>
							<th></th>
							<th id="empno">
								empno
								<c:if test="${orderType == 'desc'}">
									↓
								</c:if>
								<c:if test="${orderType == 'asc'}">
									↑
								</c:if>
							</th>
							<th>ename</th>
							<th>job</th>
							<th>sal</th>
							<th>hireDate</th>
							<!-- <th></th> -->
						</tr>
					</thead>
					<tbody>
						<c:forEach var="list" items="${list}">
							<tr>
								<td>
									<input type="checkbox" name="check" value="${list.empno}">
								</td>
								<td>${list.empno}</td>
								<td><a href="emp0?cmd=edit&empno=${list.empno}">${list.ename}</a></td>
								<td>${list.job}</td>
								<td>${list.sal}</td>
								<td>
									<fmt:formatDate value="${list.hireDate}" 
									pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"/>
								</td>
								<%-- <td>
									<form method="post" action="emp0">
										<input type="hidden" name="cmd" value="del">
										<input type="hidden" name="empno" value="${list.empno}">
										<input type="submit" value="삭제">
									</form>
								</td> --%>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</form>
		</article>
	</section>
</main>

<footer>휴먼</footer>

<script>
	document.querySelector("#empno").addEventListener("click", function(){
		const orderType = document.querySelector("[name=orderType]");
		
		// orderType의 값( '', 'desc', 'asc' )을 순환하게 만들기
		console.log(orderType.value, orderType.value == '');
		
		if(orderType.value == ''){
			orderType.value = 'desc';
		} else if(orderType.value == 'desc'){
			orderType.value = 'asc';
		} else if(orderType.value == 'asc'){
			orderType.value = '';
		}
		
		const frm = document.querySelector("#frm");
		frm.submit();
	})
</script>

</body>
</html>