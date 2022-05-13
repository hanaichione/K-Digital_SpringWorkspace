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
	<h2>login.jsp</h2><br>
	
	
	<h3>session 이용</h3><br>
	
	${sessionScope.login.userid}<br>
	${sessionScope.login.passwd}<br><br>
	
	${login.userid }<br>
	${login.passwd }<br><br>
	
	<%= session.getAttribute("login") %><br><br>
	
	<hr>
	<a href="logout">로그아웃</a>
	
	<hr><br>
	
	<h3>LoginDTO dto 이용</h3><br>
	
	el : ${loginDTO.userid } ${loginDTO.passwd }<br><br>
	
	<%
		LoginDTO dto = (LoginDTO)request.getAttribute("loginDTO");
	%>
	rq.Attr : <%=dto.getUserid() %> <%=dto.getPasswd() %>
</body>
</html>