package com.gp.patterns.adapater;

public class WeatherAdapter {
	
	public int findTemperature(int zipCode){
		
		String city=null;
		if(zipCode==19406){
			city="king of prussia";
		}
		
		WeatherFinder finder=new WeatherFinderImpl();
		int temperature = finder.find(city);
		
		return temperature;
	}

}
