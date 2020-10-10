package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exhibition")
public class Exhibition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<body>");
		out.println("<center><h1 style='color:green'>Text Fair 2018 Expo</h1>");
		out.println("<div style='justify-content:center;align-items:center;'>");
		out.println("<table style='border: 1px solid black' >");
		out.println("<tr><td>Name</td><td>Text Fair 2018 Expo</td></tr>");
		out.println("<tr><td>Hall Name</td><td>PVR SUPERPLEX</td></tr>");
		out.println("<tr><td>Start Date</td><td>10-10-2020</td></tr>");
		out.println("<tr><td>End Date</td><td>10-10-2030</td></tr>");
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
	}

}
