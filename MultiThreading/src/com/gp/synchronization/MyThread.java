package com.gp.synchronization;
public class MyThread extends Thread {

	DisplayMessage dm;
	
	String name;
	
	 MyThread(DisplayMessage dm,String name) {
		// TODO Auto-generated constructor stub
		this.dm=dm;
		this.name=name;
	}
	 
	 public void run(){
		 dm.sayHello(name);
	 }
}
