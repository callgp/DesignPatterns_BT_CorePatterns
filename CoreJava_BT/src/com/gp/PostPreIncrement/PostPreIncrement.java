package com.gp.PostPreIncrement;

public class PostPreIncrement {
	public static void main(String[] args) {
		int x=10;
		//int y =++x; 11 11
		//int y=x++;//11 10
		//int y=--x;//9 9
		int y=x--;//9 10
		System.out.println("valu of x"+x);
		System.out.println("value of y"+y);
	}

}
