package com.loginpage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
public class Controller extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("Text/html");
		String name= request.getParameter("usr");
		String pass= request.getParameter("pass");
		
		PrintWriter pw = response.getWriter();

		Model obj= new Model();
		boolean flag= obj.Authenticate(name, pass);
		if(true) {
			pw.println("<h1 style='text-align:center;'>Welcome </h1>");
			
		}
		
		
	}

}

