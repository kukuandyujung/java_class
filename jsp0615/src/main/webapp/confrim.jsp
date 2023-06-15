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
			String sbirth = request.getParameter("birth");
			
			int confirm = 2023-Integer.parseInt(sbirth);
			if(confirm>=18){
		%>
		<script type="text/javascript">
			alert("주류 판매 가능");
			location.href="https://hitejinro.com/index.asp";
		</script>
		<% 
		
				out.println(confirm +"세 입니다. 판매가능!!!!!!!!<br>");	
// 				response.sendRedirect("https://hitejinro.com/index.asp");
			}else{
		%>
		 
		 <script type="text/javascript">alert("담배 판매 불가");</script>
		  location.href="https://www.nosmokeguide.go.kr/index.do";
		<% 
				out.println(confirm +"세 입니다. 판매불가!!!!!!!!<br>");
				//response.sendRedirect("https://www.nosmokeguide.go.kr/index.do");
			}
		%>
	</body>
</html>