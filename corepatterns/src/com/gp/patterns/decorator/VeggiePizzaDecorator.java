package com.gp.patterns.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator {
	public VeggiePizzaDecorator(Pizza pizza) {
		// TODO Auto-generated constructor stub
		super(pizza);
	}
	
	public void bake(){
		super.bake();
		System.out.println("adding veggie topings");
	}
	
	

}
