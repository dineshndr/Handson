package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<body>");
		out.println("<center><h1 style=\"color:red\">Welcome to hall of Paradise</h1>");
		out.println("<p>");
		out.println("<a href='.//exhibition'>Exhibition</a>");
		out.println("<br>");
		out.println("<a href='.//stageshow'>Stage Show</a>");
		out.println("</p>");
		out.println("</body>");
	}

}
