package com.gp.datatypes;

public class ExplicitCasting {
	public static void main(String[] args) {
		int i=100;
		byte b=(byte)i;
		
		int x=97;
		
		char ch=(char)x;
		System.out.println(ch);
		
		//byte a=-50;
		
		
		
		int y=130;
		byte z=(byte)y;
		System.out.println("z is"+z);//goes 0 to 126 then -128 amd -127 then -126
		
		double q=12345.6789;
		byte h=20;
		byte result= (byte) (q+h);
		
		int m=612;
		byte n=(byte)m;
		System.out.println("n is--->"+n);//128 then -128 total 256 then 2 times is 512 so 100 remaining
		char o=(char)n;
		System.out.println(o);
		System.out.println("o is--->"+o);
		
	}
	

}
