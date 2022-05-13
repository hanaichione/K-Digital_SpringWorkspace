<%@page import="java.util.ArrayList"%>
<%@page import="com.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    <!-- isErrorPage="true" 지정해야만 Exception 객체 받을 수 있음 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	error.jsp<br>
	isErrorPage="true"설정<br>
	<%= exception.getMessage() %><br>	<!-- isErrorPage="true" 지정 -->
	<% out.print(exception.getMessage()); %>
</body>
</html>