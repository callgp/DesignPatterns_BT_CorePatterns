package com.gp.java8.predicate.joins;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x={0,10,20,30,40,50,60,70,73};
		//predicate grt than 10 first
		
		Predicate<Integer> p1=i->i>10;
		
		System.out.println("greater than 10");
	}
	
		static void method1(Predicate<Integer> p, int[] x){
			for(int eachValue : x){
				if(p.test(eachValue)){
					System.out.println(eachValue);
				}
			}
		

	}
//greater than 10

	/*
	Multiple markers at this line
	- Syntax error on token "]", :: expected after this token
	- Syntax error, insert "enum Identifier" to complete 
	 EnumHeaderName
	- Syntax error, insert "EnumBody" to complete BlockStatement
	- Syntax error, insert ";" to complete Statement*/
}
