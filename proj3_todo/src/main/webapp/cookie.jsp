<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.popup{ width: 200px; height: 300px; border: 1px solid black;}
	.hide{ display: none; }
</style>
</head>
<body>

	<div class="popup">
		공지사항입니다. <br>
		<input type="checkbox" id="popupShow"> 10초 동안 보이지 않기
	</div>

	<script>
		popupNoShow();
		function popupNoShow(){
			console.log(document.cookie); // a=a1; b=b1; popupNoShow=true or a=a1; b=b1;
			const aCookie = document.cookie.split("; "); // ; 없어지고 배열에 담겨짐
			for(let i = 0; i < aCookie.length; i++){
				const cookie = aCookie[i].split("="); // name과 value 구분
				const name = cookie[0];
				const value = cookie[1];
				
				// 값 판별
				if(name == "popupNoShow" && value == "true"){
					document.querySelector(".popup").classList.add("hide"); // hide 클래스 추가
				}
			}
			
		}

		document.querySelector('#popupShow').addEventListener("click", function(event){

			let checked = event.target.checked; // 체크 여부 true, false 돌려줌
			console.log("체크 여부 : " + checked);
			document.cookie = 'a=a1'; // 세션쿠키
			document.cookie = 'b=b1';
			console.log(document.cookie);
			console.log(new Date()); // 현재 시간


			if(checked){
				// 10초 뒤 시간 가져오기
				const now = new Date(); // 현재 시간
				console.log(now.toGMTString());
				// getSeconds : 지금 시간의 초 가져오기 -> 10초 뒤
				const after_10s = now.getSeconds() + 10; 
				now.setSeconds(after_10s); // 초단위 재설정 ( ex. 65초 -> 1분 5초 )
				console.log(now.toGMTString());
	
				// 10초 동안 살아있는 쿠키
				document.cookie = "popupNoShow=true;expires=" + now.toGMTString(); 
			}
		})

	</script>
	
</body>
</html>