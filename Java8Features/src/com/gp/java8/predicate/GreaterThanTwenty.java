package com.gp.java8.predicate;

import java.util.function.Predicate;

public class GreaterThanTwenty {

	public static void main(String[] args) {
		
		Predicate<Integer> p=i->(i>20);//lamdba ok as predicate functional interface with only one method
		
		System.out.println(p.test(15));//can pass predicateto method as arg also ok..
		System.out.println(p.test(25));
		System.out.println(p.test(55));
	}
}
/*
false
true
true*/
