package com.gp.accessmodifiers;

public class AccessModifiersA {
	
	private int a=30;
	int b=40;
	protected int c=50;
	public int d=60;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiersA aObject=new AccessModifiersA();
		System.out.println(aObject.a);
		System.out.println(aObject.b);
		System.out.println(aObject.c);
		System.out.println(aObject.d);
		

	}

}
