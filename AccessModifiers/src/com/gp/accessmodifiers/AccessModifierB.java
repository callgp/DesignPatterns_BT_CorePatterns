package com.gp.accessmodifiers;

public class AccessModifierB {
	public static void main(String[] args) {
		AccessModifiersA aObject=new AccessModifiersA();
		//System.out.println(aObject.a);//cannot access private
		System.out.println(aObject.b);
		System.out.println(aObject.c);
		System.out.println(aObject.d);
		
	}

}
