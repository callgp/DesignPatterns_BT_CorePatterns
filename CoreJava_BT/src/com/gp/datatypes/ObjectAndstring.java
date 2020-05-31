package com.gp.datatypes;

public class ObjectAndstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long x=1000;
		Long y=Long.valueOf(x);
		System.out.println(y.toString());
		String string1 = y.toString();
		
		Long z=Long.valueOf(string1);
		System.out.println("z is==>"+z);
		

	}

}
