package com.gp.overloading;

public class AutomaticPromotion2 {
	
	/*public void print(int i){
		System.out.println("int version"+i);
	}*/
	
	
	public void print(float f){
		System.out.println("int version"+f);
	}
	
	public static void main(String[] args) {
		AutomaticPromotion2 ap=new AutomaticPromotion2();
		ap.print(123);
		ap.print(1.2f);
		//int version123
		//int version1.2

		ap.print(123);//even if i comment int method still works as compiler does automatic promotion
		ap.print(1.2f);
		
	}

}
