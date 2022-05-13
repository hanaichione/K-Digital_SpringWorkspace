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
	login1.jsp<br>
	id : ${loginDTO.name}<br>
	passwd : ${loginDTO.passwd }<br>
	<hr>
	<%
		LoginDTO dto = (LoginDTO)request.getAttribute("loginDTO");
		String name = dto.getName();
		out.print("req.getAttribute: "+name+"<br>");
	%>
	<hr>
	4번 : ${dto.name }	<!-- el 태그의 특징 : 바인딩 된 값만 사용 -->
</body>
</html>