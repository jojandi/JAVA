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
		<a href="join?cmd=join">
			<input type="button" value="회원가입">
		</a>
	</div>
	<section>
		<article>
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
						<col width="7%">
						<col width="7%">
						<col width="12%">
						<col width="10%">
						<col width="37%">
						<col width="8%">
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
							<th></th>
						</tr>
					</thead>
					<tbody id="list">
						
					</tbody>
				</table>
		</article>
	</section>
</main>

<footer>휴먼</footer>

<script>

	window.addEventListener("load", function(){
		const xhr = new XMLHttpRequest();
		const url = "listEmp";

		xhr.open("get",url);
		xhr.send(); // 최종 전송
		
		xhr.onload = function(){
			console.log(xhr.responseText);
			
			try{
				// controller에서 list를 받아 옴
				const empList = JSON.parse(xhr.responseText);
				
				let html ="";
				let hireDate, yyyy, MM, dd;
				for(let i = 0; i < empList.length; i++){
					// 유닉스 시간을 날짜형식으로 변환
					hireDate = new Date(empList[i].hireDate);
					yyyy = hireDate.getFullYear(); // 년도
					MM = hireDate.getMonth()+1; // 월 ( 0 ~ 11월이기 때문에 +! )
					if(MM <= 9){ // 9이하의 달은 앞에 0 붙여줌
						MM = '0' + MM;
					}
					dd = hireDate.getDate(); // 일
					if(dd <= 9){  // 9이하의 일은 앞에 0 붙여줌
						dd = '0' + dd;
					}
					
					html += `
						<tr>
							<td>
								<input type="checkbox" name="check" value="\${empList[i].empno}">
							</td>
							<td>\${empList[i].empno}</td>
							<td><a href="info?cmd=edit&empno=\${empList[i].empno}">\${empList[i].ename}</a></td>
							<td>\${empList[i].job}</td>
							<td>\${empList[i].sal}</td>
							<td>
								\${yyyy}-\${MM}-\${dd}
							</td>
							<td>
								<form method="post" action="del">
									<input type="hidden" name="cmd" value="del">
									<input type="hidden" name="empno" value="\${empList[i].empno}">
									<input type="submit" value="삭제">
								</form>
							</td>
						</tr>
					`
				}
				
				document.querySelector("#list").innerHTML = html;
				
			}catch(e){
				console.log("ERROR : url : ", url, e);
			}
			
		}
	})

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