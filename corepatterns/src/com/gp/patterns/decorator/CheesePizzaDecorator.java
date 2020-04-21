package com.gp.patterns.decorator;

public class CheesePizzaDecorator extends PizzaDecorator {
	public CheesePizzaDecorator(Pizza pizza) {
		// TODO Auto-generated constructor stub
		super(pizza);
	}
	
	public void bake(){
		super.bake();
		System.out.println("adding cheesse topings");
	}
	
	

}
