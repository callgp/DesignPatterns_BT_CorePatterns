package com.gp.synchronization;

public class DisplayMessage {

public synchronized void sayHello(String name){
	for(int i=1;i<=10;i++){
		System.out.println("how are you"+name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//lock of this object given to first thread then to second thread..even 2 synchonization methods only one instance lock so other thread wants access to other synchronized method has to wait 
	}
	
}
}
