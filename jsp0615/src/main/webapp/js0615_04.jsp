<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.util.Arrays" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			 *{padding: 0; margin: 0;}
			 table{width: 550px; margin: 30px auto; text-align: center;}
			 table, td{border: 1px solid black; border-collapse: collapse;}
			 td{height: 35px; width: 100px;}
		</style>
	</head>
	<body>
		<%! //servlet, class
		int num=1;
		int num2= 5;
		private int sum(int a, int b){
			int total=0;
			for(int i =a; i<b ; i++){
				total += i;
			}
			return a+b;
		}
		%>
		
		<%
		
			int[] arr = {10,20,30};
		%>
				 
		<table>
				
				<tr>
				<td><%= num %></td>
				<td><%= num %></td>
				<td><%= num2 %></td>
				<td><%= sum(num, num2) %></td>
			</tr> 
			
		</table>
			
	</body>
</html>s