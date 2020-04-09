package com.gp.patterns.factory;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("preparing chicken pizza");

	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("backing chicken pizza");

	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cutting chicken pizza");

	}

}
