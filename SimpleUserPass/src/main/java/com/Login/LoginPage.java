package com.Login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginPage extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String userId= req.getParameter("userId");
		String pass=req.getParameter("pass");
		
		
		//Default userId and password is admin 
		PrintWriter pw= res.getWriter();
		if(userId.equals("admin")&&pass.equals("admin")) {
			pw.println("Valid user");
			pw.println("\n You are welcomed");
		}
		else {
			pw.println("Provided userId and pass are invalid");
			pw.println("Are you an intruder????");
		}
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		//This does nothing
		}
	

}
