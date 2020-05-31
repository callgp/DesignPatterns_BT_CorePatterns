package com.gp.executor;

public class CheckProcessorTask implements Runnable {

	String name;

	public CheckProcessorTask(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + "check process began riceesing check" + Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"check processor has completed");;

	}

}
