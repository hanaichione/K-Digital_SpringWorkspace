<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
    <!-- exception 객체 사용 위해 isErrorPage="true" -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Error 페이지</h1>
<%
	out.print(exception);
%>
<a href="../">메인화면으로</a>
<!-- loginCheck 한 경우 ..  -->
<!-- loginCheck 안 한 경우 /  -->
</body>
</html>