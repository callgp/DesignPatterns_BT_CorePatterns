package com.gp.patterns.frontcontroller;

public class CommandHelper {

	public Command getCommand(String requestURI) {
		
		if(requestURI.contains("viewStudentDetails.do")){
			return new ViewStudentCommand();
		}
		return null;
		// TODO Auto-generated method stub
		
	}

}
