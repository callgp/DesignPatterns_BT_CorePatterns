package com.gp.wrapperclasses;

public class PrimitiveAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte x=100;
		
		String string = Byte.toString(x);
		System.out.println("string is-->"+string);
		
		byte parseByte = Byte.parseByte(string);
		System.out.println("parseByte is -->"+parseByte);

	}

}
