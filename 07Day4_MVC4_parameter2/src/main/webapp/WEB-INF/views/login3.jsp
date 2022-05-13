<%@page import="com.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	login3.jsp<br>
	
	<!-- LoginDTO의 키값을 안 줬을 때 : 클래스 이름 맨 앞을 소문자로 변경한 키값 사용 -->
	id : ${loginDTO.name}<br>
	passwd : ${loginDTO.passwd }<br>
	
	<hr>
	LoginDTO의 키값 이용 : ${xxx.name } ${xxx.passwd }<br>
	<!-- el 태그의 특징 : 바인딩 된 값만 사용 -->
	<!-- controller에서 LoginDTO의 키값을 xxx로 사용 -->
	<hr>
	<% 
		LoginDTO dto = (LoginDTO)request.getAttribute("xxx");
		out.print(dto.getName()+"<br>");
		out.print(dto.getPasswd());
	%>
</body>
</html>