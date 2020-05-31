package com.gp.executor;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	int num;
	
	public MyCallable(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"is calculating sum of all numbers up to"+num);
		int sum=0;
		
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		return sum;
	}

}
