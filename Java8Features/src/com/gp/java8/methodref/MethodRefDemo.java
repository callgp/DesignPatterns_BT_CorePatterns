package com.gp.java8.methodref;

public class MethodRefDemo {
	
	public static void myMethod(){//arg should match//static metod 
	
		for(int i=0;i<=10;i++){
			System.out.println("child thread");
		}
	}
	
	public static void main(String[] args) {
		Runnable r=MethodRefDemo::myMethod;//then mapped function interfacemethod using :: and class nama as static
		//map instance similar....everything else similar..instead of repeatong put in method and reuse across appl using ::
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++){
			System.out.println("paremt thread");
		}
	}

}
