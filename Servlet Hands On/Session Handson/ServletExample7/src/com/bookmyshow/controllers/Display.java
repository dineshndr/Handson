package com.bookmyshow.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookmyshow.dao.DaoImpl;
import com.bookmyshow.model.Seat_Selector;


@WebServlet("/display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		DaoImpl dao = new DaoImpl();
		HttpSession session = request.getSession();
		Seat_Selector seat = (Seat_Selector) session.getAttribute("seat");
		dao.insert(seat);
		out.println("<h1>Ticket(s) Booked Sucessfully!!!!</h1>");
		out.println("<table style='border: 1px solid black' >");
		out.println("<tr><td style='border: 1px solid black'>Type</td><td style='border: 1px solid black'>"+seat.getType()+"</td></tr>");
		out.println("<tr><td style='border: 1px solid black'>Number of Tickets</td><td style='border: 1px solid black'>"+ seat.getNum()+"</td></tr>");
		out.println("<tr><td style='border: 1px solid black'>Price</td><td style='border: 1px solid black'>"+seat.getCost()+"</td></tr>");
		out.println("</table>");
	
}}
