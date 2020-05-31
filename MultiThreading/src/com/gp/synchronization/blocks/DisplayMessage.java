package com.gp.synchronization.blocks;

public class DisplayMessage {

	public synchronized void sayHello(String name) {// instead who lock just a
													// block u lock
System.out.println("hola"); //this piece of code can be accessed by other threads
		synchronized (this) { //this for class level lock no other thread can access stati synchronized methods while particular thread in this sync block code 
			//synchronized (DisplayMessage.class) {this also ok
			//synchronized (new String()) {this also ok..no other thread can access can access object static synchronized methods while particular thread in this sync block code 
			for (int i = 1; i <= 10; i++) {
				System.out.println("how are you" + name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // lock of this object given to first thread then to second
					// thread..even 2 synchonization methods only one instance
					// lock so other thread wants access to other synchronized
					// method has to wait
			}
		}

	}
}
