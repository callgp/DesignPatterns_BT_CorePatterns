package com.gp.accessmodifiers2;

import com.gp.accessmodifiers.AccessModifiersA;

public class AccessModifierC extends AccessModifiersA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiersA aObject= new AccessModifiersA();
		System.out.println(aObject.d);
		
		AccessModifierC cObject =new AccessModifierC();
		System.out.println(cObject.c);
		System.out.println(cObject.d);

	}

}
