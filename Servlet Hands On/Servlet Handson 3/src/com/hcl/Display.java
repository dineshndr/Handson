package com.hcl;

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

		String name = request.getParameter("name");
		String phoneNumber = request.getParameter("phn");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<body>");
		out.println("<center><h1 style='color:green'>User Details</h1>");
		out.println("<div style='display:flex;justify-content:center;align-items:center;'>");
		out.println("<table style='border: 1px solid black' >");
		out.println("<tr><td style='border: 1px solid black'>Name</td><td style='border: 1px solid black'>"+name+"</td></tr>");
		out.println("<tr><td style='border: 1px solid black'>Phone Number</td><td style='border: 1px solid black'>"+ phoneNumber+"</td></tr>");
		out.println("<tr><td style='border: 1px solid black'>Email</td><td style='border: 1px solid black'>"+email+"</td></tr>");
		out.println("<tr><td style='border: 1px solid black'>City</td><td style='border: 1px solid black'>"+city+"</td></tr>");
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
	}

}
