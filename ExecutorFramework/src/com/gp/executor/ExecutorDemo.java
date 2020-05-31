package com.gp.executor;

import java.security.Provider.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckProcessorTask[] cps={new CheckProcessorTask("ATM"),new CheckProcessorTask("Bank"),new CheckProcessorTask("mobile"),new CheckProcessorTask("web")};
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		for (CheckProcessorTask checkProcessorTask : cps) {
			service.submit(checkProcessorTask);			
		}
		service.shutdown();
		
	}

}
