package com.gp.StringConcatenation;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="xyz";
				String s2="abc";
				System.out.println(s1+s2);
				
				int a=10;
				int b=20;
				int c=30;
				System.out.println(a+b+c);
				System.out.println(s1+s2+a+b+c);//xyzabc102030..left to write it runs
				System.out.println(a+b+s1+s2+c);//+//30xyzabc30
		

	}

}
