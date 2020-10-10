package com.bookmyshow.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookmyshow.model.Seat_Selector;

@WebServlet("/confirm")
public class Confirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		int num_of_tickets = (Integer) session.getAttribute("num");
		String type = (String) session.getAttribute("type");
		int id = 0;
		int cost = 0;
		if (type.equals("Platinum")) {
			id = 1;
			cost = 250;
		} else if (type.equals("Gold")) {
			id = 2;
			cost = 200;
		} else {
			id = 3;
			cost = 150;
		}

		double price = cost*num_of_tickets;
		Seat_Selector seat = new Seat_Selector(id,type,price,num_of_tickets);
		session.setAttribute("seat", seat);
		out.println("<h1>Ticket Confirmation</h1>");
		out.println("<h4>Price of the Ticket(s) is "+price+"</h4>");
		out.println("<form method='get' action='.//display'>" );
		out.println("<input type='submit' value='confirm'");
		out.println("</form>");
		out.println("<form method='get' action='index.jsp'>" );
		out.println("<input type='submit' value='cancel'");
		out.println("</form>");
		
		
	}

}
