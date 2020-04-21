package com.gp.patterns.template;

public class XMLDataRenderer extends DataRenderer{

	@Override
	public String readData() {
		// TODO Auto-generated method stub
		System.out.println("inside readdata");
		return "xml data";
	}

	@Override
	public String processData(String data) {
		// TODO Auto-generated method stub
		System.out.println(" inside processdata");
		return "  processed  "+data;
	}
	
	

}
