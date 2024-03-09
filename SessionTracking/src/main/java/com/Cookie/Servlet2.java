package com.Cookie;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servlet2 extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		pw.println("<h1> You are in Servlet 2");
		pw.println("</h1");
		Cookie[]c=req.getCookies();
		pw.println("<label> Welcome "+ c[0].getValue());
		pw.println("</label>");
		pw.println(", Successfully got cookie");
	};
		
	}