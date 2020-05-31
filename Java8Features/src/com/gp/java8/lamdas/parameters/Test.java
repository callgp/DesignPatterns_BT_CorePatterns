package com.gp.java8.lamdas.parameters;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum s=(x,y)-> System.out.println("sum is"+(x+y));
		
		//int b;
		s.add(10, 20);
	}

}
//output is sum is30
