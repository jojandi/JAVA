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
	table{ width: 400px; border: 1px #a39485 solid; font-size: .9em; border-collapse: collapse; margin: 10px 0;}
	td { border-bottom: 1px solid #ccc; background: #fff; text-align: center; }
	#form{ width: 400px; }
	table input { width: 90%; }
	a:link{ color: inherit; text-decoration: none; }
    a:visited{ color: inherit; text-decoration: none; }
</style>
</head>
<body>

<header>
	<c:if test='${cmd == "info"}'>
		<nav>emp &gt; 회원 정보</nav>
	</c:if>
	<c:if test='${cmd == "join"}'>
		<nav>emp &gt; 회원 가입</nav>
	</c:if>
	<c:if test='${cmd == "edit"}'>
		<nav>emp &gt; 회원 수정</nav>
	</c:if>
</header>
	<div id="form">
		<table border="1">
			<tr>
				<td>empno</td>
				<td>
					<c:if test='${cmd == "info"}'>
						${dto.empno}
					</c:if>
					<c:if test='${cmd == "join"}'>
						<input type="text" id="empno" name="empno">
					</c:if>
					<c:if test='${cmd == "edit"}'>
						<input type="hidden" id="empno" value="${dto.empno}" name="empno">
						${dto.empno}
					</c:if>
				</td>
			</tr>
			<tr>
				<td>ename</td>
				<td>
					<c:if test='${cmd == "info"}'>
						${dto.ename}
					</c:if>
					<c:if test='${cmd == "join"}'>
						<input type="text" id="ename" name="ename">
					</c:if>
					<c:if test='${cmd == "edit"}'>
						<input type="text" name="ename" id="ename" value="${dto.ename}">
					</c:if>
				</td>
			</tr>
			<tr>
				<td>hireDate</td>
				<td>
					<c:if test='${cmd == "info"}'>
						${dto.hireDate}
					</c:if>
					<c:if test='${cmd == "join"}'>
						<input type="date" id="hireDate" name="hireDate">
					</c:if>
					<c:if test='${cmd == "edit"}'>
						<input type="date" name="hireDate" id="hireDate" value="${dto.hireDate}">
					</c:if>
				</td>
			</tr>
			
		</table>
		<div style="text-align: center;">
			<c:if test='${cmd == "info"}'>
				<a href="edit?empno=${dto.empno}">
					<input type="button" id="infoBtn" value="수정하기">
				</a>
			</c:if>
			<c:if test='${cmd == "join"}'>
				<input type="button" id="joinBtn" value="가입하기">
			</c:if>
			<c:if test='${cmd == "edit"}'>
				<input type="button" id="editBtn" value="수정하기">
			</c:if>
			<a href="emp"><input type="button" value="목록으로"></a>
		</div>
	</div>
	
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
		
		if(document.querySelector("#joinBtn")){
			// 회원가입
			document.querySelector("#joinBtn").addEventListener("click", function(e){
				join();
			})
		} else if(document.querySelector("#editBtn")){
			// 회원수정
			document.querySelector("#editBtn").addEventListener("click", function(e){
				edit();
			})
		}
		
		function join(){
			const empno = document.querySelector("#empno").value;
			const ename = document.querySelector("#ename").value;
			const hireDate = document.querySelector("#hireDate").value;
			
			const data = {
				"empno" : empno,
				"ename" : ename,
				"hireDate" : hireDate
			}
			
			ajax("joinEmp", data, function(result){
				if(result > 0){
					console.log(result);
					// ajax로는 페이지 이동이 불가능하기 때문에 script로 페이지 이동
					location.href="emp";
				} else{
					alert("회원가입 실패");
				}
			}, "post")
		}
		
		function edit(){
			const empno = document.querySelector("#empno").value;
			const ename = document.querySelector("#ename").value;
			const hireDate = document.querySelector("#hireDate").value;
			
			const data = {
				"empno" : empno,
				"ename" : ename,
				"hireDate" : hireDate
			}
			
			ajax("editEmp", data, function(result){
				if(result > 0){
					console.log(result);
					// ajax로는 페이지 이동이 불가능하기 때문에 script로 페이지 이동
					location.href="emp";
				} else{
					alert("회원수정 실패");
				}
			}, "put")
		}
	
	</script>

</body>
</html>