<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>

/*
 * // var const let
	let a = 1;
	//let a = 2;
	a = 2;
	
	const b = 2;
//	b = 3;

	var c = 3;
	var c = 4;
	
	d = 5;
 */


	// window.onload = function(){}
	window.addEventListener("load", function(){
		
		const btn = document.querySelector("#btn")
		btn.addEventListener("click", function(){
			
			console.log("click!!!!")
			
			const xhr = new XMLHttpRequest();
			
// 			const url = "ajax";
			const url = "ajax/list";
			const data = {
				"ename" : "이름",
				sal : 3200,
			}
			
			
			xhr.open("post", url)
			xhr.setRequestHeader("Content-Type","application/json"); // json을 보냄
			
			const strData = JSON.stringify(data); // json을 String으로 변환
			console.log(data);	// 객체 그자체
								// 네트워크는 객체를 전달할 수 없다
			console.log("data : " + ''+data);
			console.log("strData : " + strData);// 그래서 string으로 변형
			console.log("data All : " + data, strData);
			
			xhr.send(strData); // 최종적으로 보냄
			
			xhr.onload = function(){
				console.log( "받은 것" + xhr.responseText );
				
				try{
					let result = JSON.parse(xhr.responseText);
					console.log("result : " , result);
					
					console.log("result.enmae : " , result.ename);
					console.log("result[ename] : " , result[0].ename);
				}catch(e){
					console.log("josn 아님");
				}
			}
		})
		
	})

</script>

</head>
<body>

<button id="btn">ajax 실행</button>

</body>
</html>