<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:if test="${empty login }"> <!-- 로그인 정보가 없을 경우 -->
	<a href="loginForm">로그인</a>&nbsp;	<!-- xml에 주소 설정 -->
	<a href="loginCheck/CartList">장바구니</a>&nbsp;
	<a href="memberForm">회원가입</a>&nbsp;	<!-- xml에 주소 설정 -->
</c:if>

<c:if test="${!empty login }">
안녕하세요? ${login.userid}님 !<br>
	<a href="loginCheck/logout">로그아웃</a>&nbsp;
	<a href="loginCheck/mypage">mypage</a>&nbsp;
	<a href="loginCheck/CartList">장바구니</a>&nbsp;
</c:if>