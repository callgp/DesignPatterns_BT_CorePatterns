package com.gp.patterns.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type) {

		Pizza p = null;

		if (type.equals("cheese")) {
			p = new CheesePizza();
		} else if (type.equals("chicken")) {
			p = new CheesePizza();
		} else if (type.equals("vegge")) {
			p = new VeggePizza();
		}
		return p;
	}

}
