package com.java.www;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormMember")
public class FormMember extends HttpServlet {



	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("doAction");
		String stuNo=request.getParameter("stuNo"); //id에 있는 걸 찾아와줘 타입: 스트링 
	    String name =request.getParameter("name"); //pw에 있는 걸 찾아와줘 타입: 스트링 
	    String kor=request.getParameter("kor"); //namw에 있는 걸 찾아와줘 타입: 스트링 
	    String eng=request.getParameter("eng"); //gender에 있는 걸 찾아와줘 타입: 스트링 
	    String math=request.getParameter("math"); //gender에 있는 걸 찾아와줘 타입: 스트링 
	    //String[] hobbys=request.getParameterValues("math"); //gender에 있는 걸 찾아와줘 타입: 스트링  이거 완전 중요
	    
	    System.out.printf("%s, %s, %s, %s, %s\n", stuNo, name, kor, eng, math);
//	    for(int i =0; i<hobbys.length; i++) {
//	    	System.out.println(hobbys[i]);
//	    }
	    
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