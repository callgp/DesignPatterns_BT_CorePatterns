package com.gp.patterns.frontcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewStudentCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		StudentVO vo = new StudentVO(1,"Bob");
		request.setAttribute("studentDetails", vo);
		System.out.println("04212020 at 208pm");
		return "showStudentDetails";
	}

}
