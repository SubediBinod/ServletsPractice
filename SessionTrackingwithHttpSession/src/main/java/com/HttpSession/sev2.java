package com.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class sev2 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		HttpSession s= req.getSession();
		
		PrintWriter pw= res.getWriter();
		pw.println(" Successfully received Name");
		pw.println(" <br>");
		pw.println(s.getAttribute("name"));
		
		
	}

}
