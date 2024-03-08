package com.practice;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class servlet2 extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user= request.getParameter("usr");
		String pass= request.getParameter("pass");
		if(user.equals("admin")&&pass.equals("admin")) {
			response.sendRedirect("html3.html");
			
		}
		else {
			response.sendRedirect("html2.html");
		}
	}

}
