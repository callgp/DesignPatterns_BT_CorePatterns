package com.gp.patterns.template;

public abstract class DataRenderer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void render(){
		String data=readData();
		String processData = processData(data);
		System.out.println("process data is"+processData);
	}

	public abstract String readData();
	
	public abstract String  processData(String data);
	

}
