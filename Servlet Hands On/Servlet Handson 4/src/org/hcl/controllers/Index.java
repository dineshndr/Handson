package org.hcl.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ename = request.getParameter("ename");
		String hname = request.getParameter("hname");
		String type = request.getParameter("ename");
		String details = request.getParameter("details");
		String owner = request.getParameter("owner");
		String start_date = request.getParameter("start_date");
		String end_date = request.getParameter("end_date");
		PrintWriter out = response.getWriter();
		String msg="";
		if(ename.isEmpty())
			msg+="Event Name must not be empty";
		if(hname.isEmpty())
			msg+="<br>"+"Hall Name must not be empty";
		if(type.isEmpty())
			msg+="<br>"+"Type must not be empty";
		if(details.isEmpty())
			msg+="<br>"+"details must not be empty";
		if(owner.isEmpty())
			msg+="<br>"+"Owner Name must not be empty";
		if(start_date.isEmpty())
			msg+="<br>"+"Start date must not be empty";
		if(end_date.isEmpty())
			msg+="<br>"+"End date must not be empty";
		if(ename.isEmpty()||hname.isEmpty()||type.isEmpty()||details.isEmpty()||owner.isEmpty()||start_date.isEmpty()||end_date.isEmpty()) {
			out.println(msg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("./index.html");
			dispatcher.include(request, response);	
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("./display");
			dispatcher.forward(request,response);
		}
	}

}
