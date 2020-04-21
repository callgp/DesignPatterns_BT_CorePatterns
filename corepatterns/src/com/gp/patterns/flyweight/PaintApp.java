package com.gp.patterns.flyweight;

public class PaintApp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void render(int numberOfShapes){
		Shape shape=null;
		for(int i=1; i<=numberOfShapes;i++){
			if(i%2==0){
				shape=ShapeFactory.getShape("circle");
				shape.draw(i, "red", "white");
			}else{
				shape=ShapeFactory.getShape("rectangle");
				shape.draw(i, i+1, "dotted");
			}
			
		}
		
		/*
		
		Shape[] shapes=new Shape[c+1];
		for(int i=1;i<=numberOfShapes;i++){
			if(i%2==0){
				shapes[i]=new Circle();
				((Circle) shapes[i]).setRadius(i);
				((Circle) shapes[i]).setLineColor("red");
				((Circle) shapes[i]).setFillColor("white");
				shapes[i].draw();
				
			}else{
				shapes[i]=new Rectangle();
				((Rectangle) shapes[i]).setLength(i);
				((Rectangle) shapes[i]).setBreadth(i+1);
				((Rectangle) shapes[i]).setBreadth(i+1);
				((Rectangle) shapes[i]).setFillStyle("dotted");
				shapes[i].draw();
			}
		}
		
	*/}

}
