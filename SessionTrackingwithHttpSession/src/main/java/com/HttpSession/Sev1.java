package com.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Sev1 extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String name = req.getParameter("uname");

        // Set session attribute
        HttpSession session = req.getSession();
        session.setAttribute("name", name);

        // Print HTML response with button
        pw.println("<html><body >");
        pw.println("<h1>You don't have to bother about all these things, I will do all. Just click the button below:</h1>");
        pw.println("<form action='Sev2' method='post'>");
        pw.println("<input type='submit' value='Go to next servlet'>");
        pw.println("</form>");
        pw.println("</body></html>");

        pw.close();
    }
}
