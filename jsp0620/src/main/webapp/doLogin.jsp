<%@page import="com.java.www.Member"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doLogin</title>
	</head>
	<body>
	<%
	String userId = request.getParameter("id");
	String userPw = request.getParameter("pw");
	
	MemberDao mdao = new MemberDao();
	Member member = mdao.selectLogin(userId, userPw);
	
	if(member!=null){
		session.setAttribute("sessionId", member.getId());
		session.setAttribute("sessionName", member.getName());
// 		response.sendRedirect("main.jsp?loginCheck=1");
	%>
	
	<script type="text/javascript">
		alert("로그인 되었습니다.");
		location.href="main.jsp";
	</script>	
	<% }else{ %>
<!--  		response.sendRedirect("login.jsp?loginCheck=0"); --> 
		<script type="text/javascript">
			alert("아이디 또는 패스워드가 일치하지 않습니다. 다시 입력하세요.")
			history.back();
			//location.href="login.jsp"; 이것도 가능하다. 
		</script>
	<% }%>
	
	
	
	
	</body>
</html>