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
	main.jsp<br>
	${userid }
	${passwd }
	<hr>
	<%=request.getAttribute("userid") %>
	<%=request.getAttribute("passwd") %>
	<hr>
	<%=request.getParameter("userid") %>	<!-- url로 넘어가기 때문에 parameter로 가능 -->
	<%=request.getParameter("passwd") %>
</body>
</html>