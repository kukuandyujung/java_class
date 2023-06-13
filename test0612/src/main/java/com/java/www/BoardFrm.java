package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class boardFrm
 */
@WebServlet("/BoardFrm")
public class BoardFrm extends HttpServlet {

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8"); //한글처리
		System.out.println("doAction");
		String title= request.getParameter("title"); //request안에 있는 파라미터에 벌스를 가져와라!
		String content= request.getParameter("content"); //request안에 있는 파라미터에 벌스를 가져와라!
		
				
		System.out.println("제목 :" +title);
		System.out.println("내용을 입력하세요 "+content);

		

		
		
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter writer = response.getWriter();
//		writer.println("<html>");
//		writer.println("<head><title>게시판 글 쓰기</title><head>");
//		writer.println("<body>");
//		writer.println(content);
//		writer.println("</body>");
//		writer.println("</html>");
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
