package com.gp.java8.lamdas.basics;
@FunctionalInterface
public interface A {//Invalid '@FunctionalInterface' annotation; A is not a functional interface//can be having only 1 method if say functional interfaces

	void myMethod();
	//void myMethod1s();//if comment happy..not mandotory @FunctionalInterface but if say @FunctionalInterface only 1 mehtod must
}
