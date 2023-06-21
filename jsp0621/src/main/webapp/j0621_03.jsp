<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	
	
<!-- 	여러 개는 리스트를 받아서 for문을 사용하면 된다  -->
	<c:forEach var="member" items="${list}">
			<h3>${member.id}</h3>
			<h3>${member.pw}</h3>
			<h3>${member.name}</h3>
		<br>
		</c:forEach> 
	
	</body>
</html>