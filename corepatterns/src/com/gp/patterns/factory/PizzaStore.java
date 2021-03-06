package com.gp.patterns.factory;

public class PizzaStore {
	
	public Pizza orderPizza(String type){
		//Pizza p=null;
		Pizza p=PizzaFactory.createPizza(type);
		
		/*if (type.equals("cheese")) {
			p = new CheesePizza();
		} else if (type.equals("chicken")) {
			p = new CheesePizza();
		} else if (type.equals("vegge")) {
			p = new VeggePizza();
		}*/
		
		p.prepare();
		p.bake();
		p.cut();
		
		return p;
	
	}

}
