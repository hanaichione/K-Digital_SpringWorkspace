<%@page import="java.util.ArrayList"%>
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
	ccc.jsp<br>
	${loginDTO.userid}
	${loginDTO.passwd }
	<hr>
	<%= request.getAttribute("loginDTO") %>
</body>
</html>