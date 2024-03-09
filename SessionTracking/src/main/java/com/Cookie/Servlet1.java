package com.Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servlet1 extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		String name= req.getParameter("name");
		
		Cookie cookies= new Cookie("name",name);
		res.addCookie(cookies);
		pw.println("<form action='Servlet2' style='text-align:Center;' method='post'>");
		pw.println("Welcome "+name);
		pw.println("<br><label> This is servlet 1 <label>");
		pw.println("<label> Lets create a cookie and forward to next servlet.</lable><br>");
		pw.println("<label>I will do rest, you just click below button</lable><br>");
		
		pw.println("<input type='submit' value='goto next Servlet'>");
		pw.println("</from>");
	}
	

}
