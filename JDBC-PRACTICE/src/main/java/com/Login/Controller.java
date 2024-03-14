package com.Login;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@SuppressWarnings("serial")
public class Controller extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
	
		System.out.println("inside Controller");
		response.setContentType("Text/html");
	
		String name= request.getParameter("usr");
		String pass= request.getParameter("pass");
		boolean flag=false;
		PrintWriter pw = response.getWriter();

		DbConnection obj= new DbConnection();
		 try {
			flag= obj.CheckPAss(name, pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(flag) {
			pw.println("<h1 style='text-align:center;'>Welcome </h1>");
			
		}
		else {
			pw.println("Password didnt matched with the database entries");
		}
		
		
	}

}

