package com.gp.java8.lamdas.basics;

public class Test {
	public static void main(String[] args) {
		
	
/*	A a=new C();
	
	a.myMethod();*/
		
		A a=()->System.out.println("innside mymethod");
		a.myMethod();
	}
}
//get below output
//innside mymethod

