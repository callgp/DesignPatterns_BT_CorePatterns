package com.gp.patterns.factory;

public class ChickenPizza implements Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("preparing cheese pizza");

	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("backing cheese pizza");

	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cutting cheese pizza");

	}

}
