package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/stageshow")
public class StageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<body>");
		out.println("<center><h1 style='color:green'>New Year Eve</h1>");
		out.println("<div style='display:flex;justify-content:center;align-items:center;'>");
		out.println("<table style='border: 1px solid black' >");
		out.println("<tr><td>Name</td><td>New Year Eve</td></tr>");
		out.println("<tr><td>Hall Name</td><td>LuLu Mall</td></tr>");
		out.println("<tr><td>Date</td><td> 31-12-2018</td></tr>");
		out.println("<tr><td>Start Time</td><td>22:00</td></tr>");
		out.println("<tr><td>End Time</td><td>00:00</td></tr>");
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
	}

}
