package com.aitacs.jee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

@WebServlet(urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HelloServlet(){
		System.out.println("entered the HelloServlet Constructor");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entered the doGet method of HelloServlet");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		//String myTextValue = request.getParameter("myText");
		
		PrintWriter pw = response.getWriter();
		pw.append("Served at: ");
		pw.append(request.getContextPath());
		pw.append("\n");
		//pw.append("Value from myText parameter: "+ myTextValue);
		pw.append("Name : "+name);
		pw.append(" \n");
		pw.append("email : "+email + " \n");

//		RequestDispatcher rd = request.getRequestDispatcher("index.html");
//		RequestDispatcher rd = request.getRequestDispatcher("index2.html");
	//	RequestDispatcher rd = request.getRequestDispatcher("/login");
	//	rd.forward(request, response);
	//	rd.include(request, response);
	//	response.sendRedirect("index2.html");
		response.sendRedirect("./login");			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("Entered the doPost method of HelloServlet");
		doGet(request, response);
	}

}
