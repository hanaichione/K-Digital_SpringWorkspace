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
	main2.jsp<br>
	${username}
	${address }<br>
	<%= request.getAttribute("username") %>
	<%= request.getAttribute("address") %>
	
</body>
</html>