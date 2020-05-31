package com.gp.set;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj=new Random();
		int x= obj.nextInt();
		System.out.println("x is "+x);
		
		
		int y=obj.nextInt(100);
		System.out.println("y si "+y);
		
		

	}

}
