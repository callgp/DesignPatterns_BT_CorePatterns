package com.gp.overloading;

public class AutomaticPromotion3 {
	
	public void print(char i){
		System.out.println("int version"+i);
	}
	
	
	public void print(float f){
		System.out.println("int version"+f);
	}
	
	public static void main(String[] args) {
		AutomaticPromotion2 ap=new AutomaticPromotion2();
		/*ap.print(123);
		ap.print(1.2f);
		//int version123
		//int version1.2
*/
		ap.print(123);//immediate next proted type is used...if no method exact match..auto promotion upwardss it does not downwards..so float version called
		ap.print(1.2f);
		
	/*	above prints
		int version123.0
		int version1.2*/

		
	}

}
