<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 파일 첨부 시 주의할 점
	form tag에 
	method="post", enctype="multipart/form-data" 조건 필수
	단 한글 깨짐 방지를 위해 accept-charset="utf-8" 사용
 -->

<form 
	method="post"
	action="upload.do"
	enctype="multipart/form-data"
	accept-charset="utf-8"
>
	제목 : <input type="text" name="title"><br>
	내용 : <input type="text" name="content"><br>
	첨부파일 : <input type="file" name="file1"><br>
	<input type="submit" value="등록">
	
</form>
	<!-- FileDownlaod.java에서 다운 받은 이미지 출력 -->
	<img src="download.do?fileName=cat.png">

</body>
</html>