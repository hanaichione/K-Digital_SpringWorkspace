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
<h1>member폼</h1>
	<form action="member" method="post">
		아이디:<input type="text" name="userid"><br>
		비밀번호:<input type="text" name="passwd"><br>
		<input type="submit" value="회원가입">
	</form>
</body>
</html>