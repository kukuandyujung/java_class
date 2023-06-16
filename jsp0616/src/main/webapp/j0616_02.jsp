<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>foward</title>
	</head>
	<body>
		<h2>1번째 페이지입니다.</h2>
		
<!-- 		주소를 바꾸는 3가지 방법  -->		
		<script type="text/javascript">location.href="top.jsp"</script>     <!--script -->
<%-- 		<% response.sendRedirect("top.jsp"); %> --%> <!--jsp  -->
<%-- 		<jsp:forward page="top.jsp"/> --%>  <!--jsp  -->
	</body>
</html>