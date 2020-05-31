package com.gp.ifelseladder;

public class WhileExNoBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
			System.out.println("hi");
			break;//if no break goes infinity loop ...or make condition false after sometime..curly braces better
		//if no braces it says break is unreachable as while takes only 1 line without braces

	}

}
