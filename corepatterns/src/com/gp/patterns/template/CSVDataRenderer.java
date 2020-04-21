package com.gp.patterns.template;

public class CSVDataRenderer extends DataRenderer{

	@Override
	public String readData() {
		// TODO Auto-generated method stub
		System.out.println("inside readdata");
		return "csv data";
	}

	@Override
	public String processData(String data) {
		// TODO Auto-generated method stub
		System.out.println("inside processdata");
		return "processed"+data;
	}
	
	

}
