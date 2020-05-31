package com.gp.synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DisplayMessage dm=new DisplayMessage();
		
		MyThread t1=new MyThread(dm, "gp");
		MyThread t2=new MyThread(dm, "pg");
		
		t1.start();
		t2.start();
	}

}
