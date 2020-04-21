package com.gp.patterns.decorator;

public class PizzaDecorator implements Pizza {
	
	private Pizza pizza;
	
	
	public PizzaDecorator(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza=pizza;
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		pizza.bake();
		

	}

}
