<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.min.js">
	
</script>
<script type="text/javascript">
	$(function() {
		$("#aaa").on("click", function() {
			$.ajax({
				url : "aaa",
				type : "get",
				dataType : "json",	// json은 파싱 필요 없음
				success : function(data, status, xhr) {
					console.log(data.userid, "\t", data.passwd);
					$("#result").text(JSON.stringify(data));	// 데이터의 문자열화
				},
				error : function(xhr, status, error) {
					console.log(error)
				}
			}) // end ajax
		}) // end aaa

		$("#bbb").on("click", function() {
			$.ajax({
				url : "bbb",
				type : "get",
				dataType : "json",
				success : function(data, status, xhr) {
					console.log(data.length);
					for (var i = 0; i < data.length; i++) {
						console.log(data[i].userid, "\t", data[i].passwd);
					}
					$("#result").text(JSON.stringify(data));
				},
				error : function(xhr, status, error) {
					console.log(error)
				}
			}) // end ajax
		}) // end bbb

		$("#ccc").on("click", function() {
			$.ajax({
				url : "ccc",
				type : "get",
				dataType : "json",
				success : function(data, status, xhr) {
					console.log("==================");
					console.log(data.length);
					console.log(data.one);
					console.log(data.two);
					$("#result").text(JSON.stringify(data));
				},
				error : function(xhr, status, error) {
					console.log(error)
				}
			}) // end ajax
		}) // end ccc

		$("#ddd").on("click", function() {
			$.ajax({
				url : "ddd",
				type : "get", // post도 상관 없음
				dataType : "json",
				success : function(data, status, xhr) {
					console.log(data);
					$("#result").text(JSON.stringify(data));
				},
				error : function(xhr, status, error) {
					console.log(error)
				}
			}) // end ajax
		}) // end ddd
		
		$("#eee").on("click", function() {
			$.ajax({
				url : "eee",
				type : "get", // post도 상관 없음
				dataType : "text",
				success : function(data, status, xhr) {
					console.log(data);
					$("#result").text(data);
				},
				error : function(xhr, status, error) {
					console.log(error)
				}
			}) // end ajax
		}) // end eee

	})
</script>
<head>
<title>main</title>
</head>
<body>
	main.jsp~~~~~~~~~~~~~~~~~~~~~~
	<br>
	<button id="aaa">aaa호출 : login 호출</button>
	<br>
	<button id="bbb">bbb호출 : ArrayList</button>
	<br>
	<button id="ccc">ccc호출 : HashMap</button>
	<br>
	<button id="ddd">ddd호출 : String</button>
	<button id="eee">eee호출 : String</button>
	<div id="result"></div>

</body>
</html>
