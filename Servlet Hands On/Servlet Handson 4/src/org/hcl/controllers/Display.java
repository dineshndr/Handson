package org.hcl.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String ename = request.getParameter("ename");
		String hname = request.getParameter("hname");
		String type = request.getParameter("type");
		String details = request.getParameter("details");
		String owner = request.getParameter("owner");
		String sdate = request.getParameter("sdate");
		String edate = request.getParameter("edate");
		out.println("<body>");
		out.println("<center><h1 style='color:green'>Event Sucessfully Registered!!!!</h1>");
		out.println("<div 'justify-content:center;align-items:center;'>");
		out.println("<table style='border: 1px solid black' >");
		out.println("<tr><td>Event Name</td><td>"+ename+" </td></tr>");
		out.println("<tr><td>Hall Name</td><td>"+hname+"</td></tr>");
		out.println("<tr><td>type</td><td>"+type+" </td></tr>");
		out.println("<tr><td>details</td><td>"+details+" </td></tr>");
		out.println("<tr><td>Owner Name</td><td>"+owner+" </td></tr>");
		out.println("<tr><td>Start Date</td><td> "+sdate+"</td></tr>");
		out.println("<tr><td>End Date</td><td>"+edate+"</td></tr>");
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
	}

}
