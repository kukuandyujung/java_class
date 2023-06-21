package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class requestPage1
 */
@WebServlet("/r1")
public class requestPage1 extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		request.setAttribute("id", "admin");
		request.setAttribute("pw", "1234");
		
//		response.sendRedirect("j0621_01.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("j0621_01.jsp");
		rd.forward(request, response);
//		디스패처는 리셋해서 싹다 만들지 말고 유지해서 새롭게 만들어줘 라는 뜻  
		
		
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter writer =response.getWriter();
//		writer.print("<html><head>");
//		writer.print("</head>");
//		writer.print("<body>");
//		writer.print("<h3></h3>");	
//		writer.print("</body>");		
//		writer.print("</html>");
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet");
		doAction(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doPost");
		doAction(request, response);
	}

}
