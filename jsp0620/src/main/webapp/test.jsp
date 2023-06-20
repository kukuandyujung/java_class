<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>test</title>
	</head>
	<body>
		${1}
		<%= request.getParameter("id") %>		
		${param.id}
		<%= request.getAttribute("sessionId")%>		
		${sessionScope.sessionId}
		${sessionId}
	
		${1+2}
		${1*2}
		${3/2}
		
	</body>
</html>