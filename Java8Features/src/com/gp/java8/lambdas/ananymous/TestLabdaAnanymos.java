package com.gp.java8.lambdas.ananymous;

public class TestLabdaAnanymos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Runnable r=new MyRunnableImple();
		Thread t=new Thread(r);
		t.start();*/
		
/*		Runnable r=()->{
			
			for(int i=1;i<=10;i++){
				System.out.println("childdd thrd");
			}
		};*/
		
		Thread t=new Thread(()->{
			
		
		for(int i=1;i<=10;i++){
			System.out.println("chiildd thread");
		}
		});
		t.start();
		
		for(int i=1;i<=10;i++){
			System.out.println("main thread");
		}

	}

}

/*similar as old output
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
chiildd thread
chiildd thread
chiildd thread
chiildd thread
chiildd thread
chiildd thread
chiildd thread
chiildd thread
chiildd thread
chiildd thread
*/

/*main thread
chd thred
chd thred
chd thred
chd thred
chd thred
chd thred
chd thred
chd thred
chd thred
chd thred
chd thred
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread*/


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


