package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/stuInput")
public class stuInput extends HttpServlet {



	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("doAction");
		String stuNo=request.getParameter("stuNo"); //id에 있는 걸 찾아와줘 타입: 스트링 
	    String name =request.getParameter("name"); //pw에 있는 걸 찾아와줘 타입: 스트링 
	    String kor=request.getParameter("kor"); //namw에 있는 걸 찾아와줘 타입: 스트링 
	    String eng=request.getParameter("eng"); //gender에 있는 걸 찾아와줘 타입: 스트링 
	    String math=request.getParameter("math"); //gender에 있는 걸 찾아와줘 타입: 스트링 
	    //String[] hobbys=request.getParameterValues("math"); //gender에 있는 걸 찾아와줘 타입: 스트링  이거 완전 중요
	    int total = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
	    System.out.printf("%s, %s, %s, %s, %s, %d\n", stuNo, name, kor, eng, math, total);
//	    for(int i =0; i<hobbys.length; i++) {
//	    	System.out.println(hobbys[i]);
//	    }
	    response.setContentType("text/html; charset=utf-8");
	    PrintWriter writer = response.getWriter();
	    
	    writer.println("<html>");
	    writer.println("<head></hesd>");
	    writer.println("<body>");
	    writer.println("<h2>학생성적</h2>");
	    writer.println("<p>학번: "+stuNo+"</p>");
	    writer.println("<p>이름: "+name+"</p>");
	    writer.println("<p>국어: "+kor+"</p>");
	    writer.println("<p>영어: "+eng+"</p>");
	    writer.println("<p>수학: "+math+"</p>");
	    writer.println("<p>합계: "+total+"</p>");
	    writer.println("</body>");
	    writer.println("</html>");
	    
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
}

	
	
	
}//class
