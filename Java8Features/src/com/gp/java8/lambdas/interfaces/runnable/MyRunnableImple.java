package com.gp.java8.lambdas.interfaces.runnable;

public class MyRunnableImple implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++){
			System.out.println("child thread");
		}
	}

}
