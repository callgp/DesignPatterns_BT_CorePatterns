package com.gp.overloading;

public class AutomaticPromotionObjectTypes {
	
	public void print(long i){
		System.out.println("int version"+i);
	}
	
	
	public void print(float f){
		System.out.println("int version"+f);
	}
	
	
	/*public void print(String s){
		System.out.println("string version"+s);
	}*/
	
	
	public void print(Object o){
		System.out.println("obj version"+o);
	}
	
	public static void main(String[] args) {
		AutomaticPromotionObjectTypes ap=new AutomaticPromotionObjectTypes();
		/*ap.print(123);
		ap.print(1.2f);
		//int version123
		//int version1.2
*/
		ap.print(123);//if long there long version invoke its immediate  order float>long>int https://stackoverflow.com/questions/43796767/java-overloading-long-and-float//immediate next proted type is used...if no method exact match..auto promotion upwardss it does not downwards..so float version called
		ap.print(1.2f);
		ap.print("hi");//if i comment string version obj version called..but first priority to child
		
	/*	above prints
		int version123.0
		int version1.2*/

		
	}

}
