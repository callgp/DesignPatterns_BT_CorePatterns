package com.gp.patterns.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gp.patterns.mvc.model.AverageModel;
import com.gp.patterns.mvc.model.GreaterModel;

/**
 * Servlet implementation class AverageController
 */
@WebServlet("/greaterController")
public class GreaterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int num1=Integer.parseInt(request.getParameter("number1"));
		int num2=Integer.parseInt(request.getParameter("number2"));
		
		//AverageModel model =new AverageModel();
		//int result=model.calculateAverage(num1, num2);
		
		GreaterModel model =new GreaterModel();
		int result=model.calculateGreater(num1, num2);
		
		request.setAttribute("result",result);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);
	
	}

}
