package com.bookmyshow.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int num_of_tickets=Integer.parseInt(request.getParameter("num"));
		System.out.println(num_of_tickets);
		String type = request.getParameter("type");
		if(num_of_tickets==0||type.isEmpty())
			{
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("./index.jsp");
			dispatcher.include(request, response);
			
			out.println("<h3> Enter all the feilds</h3>");
			}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("type", type);
			session.setAttribute("num", num_of_tickets);
			RequestDispatcher dispatcher = request.getRequestDispatcher("./confirm");
			dispatcher.forward(request, response);
		}
	}
	

}
