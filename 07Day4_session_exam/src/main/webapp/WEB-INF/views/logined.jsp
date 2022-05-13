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
	<h2>logined.jsp</h2><br>
	
	${sessionScope.login.userid}<br>
	${sessionScope.login.passwd}<br><br>
	<hr>
	${login.userid }<br>
	${login.passwd }<br>
	<hr>
	<%= session.getAttribute("login") %><br>
	<hr>
	<a href="logout">로그아웃</a>
	
</body>
</html>