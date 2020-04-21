package com.gp.patterns.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher {

	public void dispatch(HttpServletRequest request, HttpServletResponse response, String view) {
		// TODO Auto-generated method stub
		
		if(view !=null){
			RequestDispatcher dispatcher = request.getRequestDispatcher(mapPageToView(view));
			try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private String mapPageToView(String view) {
		// TODO Auto-generated method stub
		if(view.equals("showStudentDetails")){
		return "viewStudentDetails.jsp";
		}
		return null;
	}

}
