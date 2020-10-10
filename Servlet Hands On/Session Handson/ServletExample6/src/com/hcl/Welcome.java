package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String ename= (String) session.getAttribute("ename");
		PrintWriter out = response.getWriter();
		out.println("<body>");
		out.println("<h1>Event Management System</h1>");
		out.println("<h3>Welcome to this Event "+ename +"</h3>");
		out.println("<form method='get' action='.//display'>");
		out.println("<input type='submit' value='details'>");
		out.println("</form>");
		out.println("</body>");
	
	}

}
