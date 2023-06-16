<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage = "true"  %>
 <% response.setStatus(200); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>error500</title>
		<style type="text/css">
			*{margin: 0; padding: 0;}
			div{width: 700px; height:200px; padding:30px; margin: 50px auto; border: 1px solid #efefef;}
			img{width: 700px;}
		</style>
	</head>
	<body>
		<div onclick="javascript:history.back();">
			<a href="main.jsp"><img src="images/error500.jpg"></a>
		</div>
	</body>
</html>