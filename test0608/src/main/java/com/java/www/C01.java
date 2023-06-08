package com.java.www;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//인터넷으로 접근이 가능함 
//보완이 약하기 때문에 보완이 필요한 DB가 아닌 데이터를 가져와서 넘겨주는 담당을 한다. 
//실제로 보여지는 페이지는 JSP view 페이지를 사용한다. 
//url로 들어가는 경우에는 get방식이다. 
//중요한 데이터는 post로 보냄 <우리는 대부분 이 작업을 한다.> 
@WebServlet("/C01")
public class C01 extends HttpServlet {
//doget으로 접근해서 doaction으로 간 것이다. 
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException{
		
		System.out.println("doAction으로 접근했습니다.");
		request.setCharacterEncoding("utf-8"); //데이터 전달받을 시 한글 처리를 할 때. 
		response.setContentType("text/html; charset=utf-8");
		//BufferedWriter 와 다르게 PrintWriter는 시스아웃가능 
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>jsp페이지</title></head>");
		writer.println("<style>{font-size: 30px;}</style>");
		writer.println("<body>");
		writer.println("<h2>서블릿에서 페이지를 생성하고 있습니다.</h2>");
		writer.println("<a href = 'index.jsp'> index페이지 이동</a>");
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}
       
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet으로 접근했습니다.");
		doAction(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("doPost으로 접근");
		doAction(request, response);
	}

}
