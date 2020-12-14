package com.coffee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.coffee.model.*; 

public class CoffeeSelect extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String c = request.getParameter("coffee");
		
		CoffeeExpert ce = new CoffeeExpert();
		List result = ce.getCoffee(c);
		
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		//out.println("My Coffee Selection <br>");
		
		request.setAttribute("styles", result);
		
		RequestDispatcher view = request.getRequestDispatcher("results.jsp");
		
		view.forward(request, response);
	}
}
