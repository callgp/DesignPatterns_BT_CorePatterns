package com.gp.patterns.decorator;

public class PizzaShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pizza pizza=new PlainPizza();
		Pizza pizza=new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
		pizza.bake();

	}

}
