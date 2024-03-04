package com.Binod;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Square extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k=(int) req.getAttribute("k");
		
		k=k*k;
		
		PrintWriter pw= res.getWriter();
		pw.println("The square of the number is is "+k);
		
	}

}
