<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	 <%
	 
	 String id =request.getParameter("id");
	 String name =request.getParameter("name");
	 if(id.equals("aaa")){ //aaa라는 아이디가 존재할 시에 
		response.sendRedirect("js0615_08.jsp");
	 }else{
		 response.sendRedirect("join03_success.jsp?userId="+id+"&name="+ name);  //아주아주 중요 파라미터에 직접 입력해서 이렇게 보내는 것 아주 중요. 
		 
	 }
	 
	 %>
	</body>
</html>