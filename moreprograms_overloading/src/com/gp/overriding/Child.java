package com.gp.overriding;

public class Child extends Parent {
	
	String s="child";
	public String doSomething(String s){//if parent static child also make static
		System.out.println("child method");
		return s;
	}
/*	Multiple markers at this line
	- overrides com.gp.overriding.Parent.doSomething
	- This instance method cannot override the static method 
	 from Parent*/

}
