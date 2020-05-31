package com.gp.default_methods.multiple_inheritance;

public interface X {

	default void m1(){
		System.out.println("m1 inside A");
	}
}
