package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/eventhome")
public class EventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<body>");
		out.println("<center><h1 style=\"color:red\">Welcome to hall of Paradise</h1>");
		out.println("<p>");
		out.println("The types of Events are ");
		out.println("<center><ul>");
		out.println("<li>Exhibition</li>");
		out.println("<li>Stage Show</li>");
		out.println("</ul>");
		out.println("</p>");
		out.println("</body>");
		
	}

}
