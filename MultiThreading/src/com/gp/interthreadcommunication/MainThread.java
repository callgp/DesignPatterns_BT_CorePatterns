package com.gp.interthreadcommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread t=new MyThread();
		t.start();
		
		synchronized(t){
			System.out.println("main threrad is going to wait");
			t.wait();
			System.out.println("main thread notified");
		System.out.println(t.total);//if comes before completing wrong total so put a sync block
		}
	}

}
