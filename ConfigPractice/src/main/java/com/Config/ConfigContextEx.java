package com.Config;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ConfigContextEx extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		String name= config.getInitParameter("Name");
		System.out.println("name is "+name);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ServletConfig config= getServletConfig();
		PrintWriter pw = res.getWriter();
		pw.println("Name is"+" "+config.getInitParameter("Name"));
		pw.println("Address is "+config.getInitParameter("Address"));
		pw.println("Phone is "+ config.getInitParameter("Mobile"));
		
		
	}

}
