package com.gp.interthreadcommunication;
public class MyThread extends Thread {

	int total;

	/*DisplayMessage dm;
	
	String name;
	
	 MyThread(DisplayMessage dm,String name) {
		// TODO Auto-generated constructor stub
		this.dm=dm;
		this.name=name;
	}
	 */
	 public void run(){
		 //dm.sayHello(name);
		 System.out.println("child thread calculating sum");
		 synchronized(this){
		 for (int i = 0; i <=100; i++) {
			 total+=i;
			
		}
		 this.notify();
		 }
	 }
}
