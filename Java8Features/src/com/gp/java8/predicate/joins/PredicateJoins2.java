package com.gp.java8.predicate.joins;

import java.util.function.Predicate;

public class PredicateJoins2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x={0,10,20,30,40,50,60,70,73};
		//predicate grt than 10 first
		
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		
		
		System.out.println("greater than 10");
		method1(p1,x);
		
		System.out.println("even nbr:");
		method1(p2,x);
		
		System.out.println("not greater than 10");
		method1(p1.negate(),x);
		
		System.out.println(" greater than 10 and even");
		method1(p1.and(p2),x);
		
		System.out.println(" greater than 10 or even");
		method1(p1.or(p2),x);
		
		
	}
	
		static void method1(Predicate<Integer> p, int[] x){
			for(int eachValue : x){
				if(p.test(eachValue)){
					System.out.println(eachValue);
				}
			}
		

	}
		
		/*greater than 10
		20
		30
		40
		50
		60
		70
		73
		even nbr:
		0
		10
		20
		30
		40
		50
		60
		70
		not greater than 10
		0
		10
		 greater than 10 and even
		20
		30
		40
		50
		60
		70
		 greater than 10 or even
		0
		10
		20
		30
		40
		50
		60
		70
		73

		*/
		/*
		greater than 10
		20
		30
		40
		50
		60
		70
		73
		even nbr:
		0
		10
		20
		30
		40
		50
		60
		70
		not greater than 10
		0
		10
		 greater than 10 and even
		20
		30
		40
		50
		60
		70
*/
		
		
	/*	greater than 10
		20
		30
		40
		50
		60
		70
		73
		even nbr:
		0
		10
		20
		30
		40
		50
		60
		70
		not greater than 10
		0
		10*/

		/*greater than 10
		20
		30
		40
		50
		60
		70
		73
		even nbr://73 not there as that is odd nbr
		0
		10
		20
		30
		40
		50
		60
		70*/
	
		
		
//greater than 10

	/*
	Multiple markers at this line
	- Syntax error on token "]", :: expected after this token
	- Syntax error, insert "enum Identifier" to complete 
	 EnumHeaderName
	- Syntax error, insert "EnumBody" to complete BlockStatement
	- Syntax error, insert ";" to complete Statement*/
}
