<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.min.js">	
</script>
<script type="text/javascript">
	$(function () {
		$("#aaa").on("click", function () {
			$.ajax({
				url : "aaa",
				type : "post",
				dataType : "text",
				headers : {
					"Content-Type":"application/json"
				},
				data : JSON.stringify({userid:"홍길동", passwd:"1234"}),	// json을 문자열로
				success : function (data, status, xhr) {
					console.log(data);
				},
				error : function (xhr, status, error) {
					console.log(error)
				}
			})	// end ajax
		})	// end aaa
		
		$("#bbb").on("click", function () {
			$.ajax({
				url : "bbb",
				type : "post",
				dataType : "text",
				headers : {
					"Content-Type":"application/json"
				},
				data : JSON.stringify(	// 배열로 전송
						[{userid:"홍길동", passwd:"1234"},
						{userid:"이순신", passwd:"4567"}]
						),	// json을 문자열로
				success : function (data, status, xhr) {
					console.log(data);
				},
				error : function (xhr, status, error) {
					console.log(error)
				}
			})	// end ajax
		})	// end bbb

		$("#ccc").on("click", function () {
			$.ajax({
				url : "ccc",
				type : "get",
				dataType : "text",
				data : {userid:"홍길동", passwd:"1234"},	// 그냥 text로 전달, parameter로 뽑음
				success : function (data, status, xhr) {
					console.log(data);
				},
				error : function (xhr, status, error) {
					console.log(error)
				}
			})	// end ajax
		})	// end ccc
		
		$("#ddd").on("click", function () {
			$.ajax({
				url : "ddd",
				type : "get",	// post도 상관 없음
				dataType : "text",
				data : {userid:"홍길동"},	// 그냥 text로 전달, parameter로 뽑음
				success : function (data, status, xhr) {
					console.log(data);
				},
				error : function (xhr, status, error) {
					console.log(error)
				}
			})	// end ajax
		})	// end ddd
		
	})
</script>
<head>
<title>main</title>
</head>
<body>
	<button id="aaa">aaa호출</button>
	<br>
	<button id="bbb">bbb호출</button>
	<br>
	<button id="ccc">ccc호출</button>
	<br>
	<button id="ddd">ddd호출</button>
	<br>
	<div id="result"></div>
</body>
</html>
