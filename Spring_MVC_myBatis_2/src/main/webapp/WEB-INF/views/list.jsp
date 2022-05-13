<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>list.jsp</h1>
${list}
<hr>
<form action="add">
deptno : <input type="text" name="deptno"><br>
dname : <input type="text" name="dname"><br>
loc : <input type="text" name="loc"><br>
<input type="submit" value="전송">
</form>
<hr>
삭제 : <a href="del?deptno=51">삭제하기</a>
<hr>
수정
<form action="update">
deptno : <input type="text" name="deptno"><br>
dname : <input type="text" name="dname"><br>
loc : <input type="text" name="loc"><br>
<input type="submit" value="수정">
</form>
</body>
</html>