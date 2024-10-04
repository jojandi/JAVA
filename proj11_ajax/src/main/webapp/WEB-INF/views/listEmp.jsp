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
	table{ width: 550px; border: 1px #a39485 solid; font-size: .9em; border-collapse: collapse; margin-top: 10px;}
	th{ text-align: center; border-bottom: 2px solid #ccc; padding: 10px;}
	thead { font-weight: bold; }
	td { border-bottom: 1px solid #ccc; background: #fff; text-align: center; }
	caption{ display: none; }
	#aDiv{ text-align: right; width: 550px; }
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
		<a href="join">
			<input type="button" value="회원가입">
		</a>
	</div>
	<section>
		<article>
			<form method="get" action="emp0">
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
						<col width="15%">
						<col width="15%">
						<col width="15%">
						<col width="10%">
						<col width="20%">
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
			</form>
		</article>
	</section>
</main>

<footer>휴먼</footer>

<script>

	// ajax 실행 메소드 
	function ajax(url, param, cb, method){	// cb : callback 함수

		if(!method) method = "get"; // method 기본값 설정
		
		const xhr = new XMLHttpRequest();

		xhr.open(method,url);
		xhr.setRequestHeader("Content-Type","application/json");		
		const strData = JSON.stringify(param); 
		console.log("strData : " + strData);
		xhr.send(strData); // 최종 전송
		
		// typeof : 변수의 타입을 문자로 알려줌
		if(typeof cb == "function"){
			xhr.onload = function(){
				cb(xhr.responseText); // 전달인자 -> ajax에서 받아온 것
			}
		}
	}
	
	// ajax를 통해 list를 가져와서 list를 그림
	function getList(){
		ajax("listEmp", null, drawList);
	}
	
	// list를 그려주는 메소드
	function drawList(text){
		const empList = JSON.parse(text);
		
		let html ="";
		if(empList.length == 0){
			html = "<tr><td colspan='7'>자료가 없습니다</td></tr>"
		} else{
			for(let i = 0; i < empList.length; i++){
				// 유닉스 시간을 날짜형식으로 변환
				const hireDate = new Date(empList[i].hireDate);
				let yyyy = hireDate.getFullYear(); // 년도
				let MM = hireDate.getMonth()+1; // 월 ( 0 ~ 11월이기 때문에 +! )
				if(MM <= 9){ // 9이하의 달은 앞에 0 붙여줌
					MM = '0' + MM;
				}
				let dd = hireDate.getDate(); // 일
				if(dd <= 9){  // 9이하의 일은 앞에 0 붙여줌
					dd = '0' + dd;
				}
				
				html += `
					<tr>
						<td>
							<input type="checkbox" name="check" value="\${empList[i].empno}">
						</td>
						<td>\${empList[i].empno}</td>
						<td><a href="info?empno=\${empList[i].empno}">\${empList[i].ename}</a></td>
						<td>\${empList[i].job}</td>
						<td>\${empList[i].sal}</td>
						<td>\${yyyy}-\${MM}-\${dd}</td>
						<td>
							<input type="button" value="삭제" 
							id="btn_\${empList[i].empno}" data-empno="\${empList[i].empno}">
						</td>
					</tr>
				`
			}
			document.querySelector("#list").innerHTML = html;
			bind();
		}
	}


	// 삭제 버튼에 클릭이벤트를 주어 ajax로 delEmp로 이동
	function bind(){
		// [id^=btn_] : btn으로 시작하는 id
		// [id$=btn_] : btn_로 끝나는 id
		const delBtnList = document.querySelectorAll("[id^=btn_]");
		// 향상된 for문
		for(let btn of delBtnList){
			btn.addEventListener("click", function(e){
				console.log(e.target);
				
				// id 속성을 가져와 substr, split 등을 사용하여 empno만 추출
				// 삭제 버튼 자체에 empno 속성을 주어 한 번에 추출
				const empno = e.target.getAttribute("data-empno");
				console.log("empno :", empno);
				
				const data = {
						"empno" : empno // 함수 써도 됨 ( return 값을 넣어줌 )
				}
				
				// ajax 실행
				ajax("delEmp", data, function(result){
					if(result > 0){
						// 리스트 그리기
						getList();
					} else{
						alert("삭제 실패")
					}
				}, "delete");
			})
		}
	}

	window.addEventListener("load", function(){
		getList();
	})

	// empno를 기준으로 order by 하기 //
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