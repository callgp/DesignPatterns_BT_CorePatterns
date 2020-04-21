package com.gp.patterns.adapater;

public class WeatherUI {

	public void showTemperature(int zipCode){
		//WeatherFinder finder=new WeatherFinderImpl();
		//finder.find(city)
		WeatherAdapter adapter=new WeatherAdapter();
		System.out.println(adapter.findTemperature(19406));
	}
	
	public static void main(String[] args){
		WeatherUI ui=new WeatherUI();
		ui.showTemperature(19406);
	}
}
