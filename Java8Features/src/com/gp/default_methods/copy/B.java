package com.gp.default_methods.copy;

public class B implements A {
	 public void m1(){//Default methods are allowed only in interfaces so remove...cammpt rediuce visibiity so make public as interface default is public visibility even it says default there in A for default method impl
		System.out.println("m1...in B");
	}

}
