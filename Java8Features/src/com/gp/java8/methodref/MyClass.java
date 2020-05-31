package com.gp.java8.methodref;

public class MyClass {
	
	public void myMethod123(int i){
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface f=i->System.out.println(i);
		f.MyMethod(10);
		MyClass c=new MyClass();
		
		MyInterface f1=c::myMethod123;//instance method to functional inerface using ::
		f.MyMethod(20);
	}

}
/*10
20*/

//10

