package com.ContextConFigEx;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ContextConfig extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
	PrintWriter pw= res.getWriter();
	
	ServletConfig config= getServletConfig();
	pw.println(config.getInitParameter(""));
}

}
