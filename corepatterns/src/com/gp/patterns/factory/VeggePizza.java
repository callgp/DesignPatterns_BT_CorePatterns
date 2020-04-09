package com.gp.patterns.factory;

public class VeggePizza implements Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("preparing Vegge pizza");

	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("backing Vegge pizza");

	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cutting Vegge pizza");

	}

}
