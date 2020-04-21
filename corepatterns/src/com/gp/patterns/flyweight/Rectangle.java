package com.gp.patterns.flyweight;

public class Rectangle extends Shape {
	
	private String label;
	/*private int length;
	private int breadth;
	private String fillStyle;*/

	public Rectangle() {
		// TODO Auto-generated constructor stub
		label="rectangle...";
	}
	@Override
	public void draw(int length, int breadth, String fillStyle) {
		// TODO Auto-generated method stub
		System.out.println(" drawing a "+label+" with lenght"+length+" with breadth "+breadth+" fill sytle is " +fillStyle);

	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

/*	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public String getFillStyle() {
		return fillStyle;
	}

	public void setFillStyle(String fillStyle) {
		this.fillStyle = fillStyle;
	}*/

}
