package com.gp.java8.lambdas.interfaces.runnable;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Runnable r=new MyRunnableImple();
		Thread t=new Thread(r);
		t.start();*/
		
		Runnable r=()->{
			
			for(int i=1;i<=10;i++){
				System.out.println("childdd thrd");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=1;i<=10;i++){
			System.out.println("main thread");
		}

	}

}

/*
 * upto thrrad scheduler which first main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
childdd thrd
childdd thrd
childdd thrd
childdd thrd
childdd thrd
childdd thrd
childdd thrd
childdd thrd
childdd thrd
childdd thrd*/


