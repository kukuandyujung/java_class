<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>request</title>
	</head>
	<body>
		<%
// 			String uri = request.getRequestURI();
// 			String cPathLength = request.getContextPath().length()+1;
// 			String fileName = uri.substring(cPathLength);
		
			out.println("url : "+ request.getRequestURL()+ "<br>");
			out.println("uri : "+ request.getRequestURI()+ "<br>");
			out.println("contextPath : "+ request.getContextPath()+ "<br>");			
			out.println("서버 : "+ request.getServerName()+ "<br>");
			out.println("포트번호 : "+ request.getServerPort()+ "<br>");
			out.println("요청 방식 : "+ request.getMethod()+ "<br>");
			out.println("프로토콜 : "+ request.getProtocol()+ "<br>");
			out.println("ip : "+ request.getRemoteAddr()+ "<br>");
// 			out.println("파일명: "+ fileName+ "<br>");
			out.println("파일명: "+ request.getRequestURI().substring(8)+ "<br>");
		
		
		%>
			
	</body>
</html>