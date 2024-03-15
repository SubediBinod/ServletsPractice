package com.Login;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;
@SuppressWarnings("serial")
public class Controller extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
	
		System.out.println("inside Controller");
		response.setContentType("Text/html");
	
		String name= request.getParameter("usr");
		String pass= request.getParameter("pass");
		boolean flag=false;
		PrintWriter pw = response.getWriter();

		DbConnection obj = new DbConnection();
			 String[] arr = null;
			try {
				arr = obj.CheckPAss(name, pass);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(name.equals(arr[0]) && pass.equals(arr[1])) {
			pw.println("<h1 style='text-align:center;'>Welcome </h1>");
			pw.println("Welcome dear user"+name );
			
		}
		else if(name.equals(arr[0])&& (! pass.equals(arr[1]))) {
			pw.println("<h1 style='text-align:center;'>Password didn't match!!! Remember to eat soaked almonds every day!!!</h1>");

		}
		else {
			pw.println("user not found ");
			pw.println("<br>");
			pw.println("Go away intruder!!!!!!!!");
		}
		
		
	}

}

