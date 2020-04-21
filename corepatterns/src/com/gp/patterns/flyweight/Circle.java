package com.gp.patterns.flyweight;

public class Circle extends Shape {

	private String label;
	/*private int radius;
	private String fillColor;
	private String lineColor;*/
	
	public Circle(){
		label="circle";
	}
	@Override
	public void draw(int radius,String fillColor, String lineColor) {
		// TODO Auto-generated method stub
		System.out.println("drawing a "+label+" with radius "+radius+"fill colr is "+fillColor+"linecolr is "+lineColor);

	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
/*	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}*/

}
