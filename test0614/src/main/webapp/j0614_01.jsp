<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			table, th, td{border: 1px solid black; border-collapse: collapse; 
			text-align: center;}
			td{width: 120px; height: 30px}
		</style>
	</head>
	<body>
		<table>
		<tr>
			<th>i</th>
			<th>sum</th>
		</tr>
		<% 
			int sum=0;
			for(int i =1; i<101 ; i++){
			   sum= i+ sum;
			   %>
			<tr>
				<td><%out.println(i);%></td>
				<td><%out.println(sum);%></td>
			</tr>
			<% 
			}
			//out.println("합계는" + sum);
		%>
			
			<tr>
				<th>i</th>
				<th>sum</th>
			</tr>
	
			
		</table>
	</body>
</html>