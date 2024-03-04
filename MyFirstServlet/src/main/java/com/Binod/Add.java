
package com.Binod;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Add extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException  {
		String num1Str = req.getParameter("num1");
	    String num2Str = req.getParameter("num2");

	    if (num1Str == null || num2Str == null) {
	        // Handle case where parameters are missing
	        PrintWriter w = res.getWriter();
	        w.println("Error: Both numbers must be provided");
	        return;
	    }

	    int i = Integer.parseInt(num1Str);
	    int j = Integer.parseInt(num2Str);
	    int k = i + j;
	    PrintWriter pw= res.getWriter();
	    

	    
	    
	    req.setAttribute("k",k);
	    
	    //To call an another servlet form this servlet
	    
	    RequestDispatcher rd= req.getRequestDispatcher("sq");
	    rd.forward(req, res);
	    
	   
	    
	    
		
		
	}
	

}

