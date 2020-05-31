package com.gp.overriding;

public class Parent {
	
	String s="parent";

	public String doSomething(String s){
		System.out.println("parent method");
		return s;
	}
}
