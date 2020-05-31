package com.gp.yield;

public class MyThread extends Thread {
	
	public void run(){
		
		for (int i = 0; i <=10; i++) {
			//array_type array_element = array[i];
			System.out.println("child thread");
			//Thread.yield();//yields for main thread //Yield tells the currently executing thread to give a chance to the threads that have equal priority in the Thread Pool. There is no guarantee that Yield will make the currently executing thread to runnable state immediately. It can only make a thread from Running State to Runnable State, not in wait or blocked state.
			
		}
		
		
	}

}
