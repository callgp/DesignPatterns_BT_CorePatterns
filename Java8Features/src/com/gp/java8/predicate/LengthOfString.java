package com.gp.java8.predicate;

import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p=s->(s.length()>5);//s is parameter here
		System.out.println(p.test("gpp"));
		System.out.println(p.test("gppffff"));

	}

}
/*false
true
*/