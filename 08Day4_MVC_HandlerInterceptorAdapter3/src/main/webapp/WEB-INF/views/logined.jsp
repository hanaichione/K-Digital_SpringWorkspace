<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	logined.jsp<br>
	data : ${userid}<br>
	data : ${passwd }<br>
	data : ${login }
	<hr>
	<%= request.getAttribute("userid") %>
	<%= request.getAttribute("passwd") %>
</body>
</html>