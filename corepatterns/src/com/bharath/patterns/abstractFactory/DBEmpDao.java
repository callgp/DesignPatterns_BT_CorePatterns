package com.bharath.patterns.abstractFactory;

public class DBEmpDao implements Dao {
	@Override
	public void save(){
		System.out.println("saving emp to db");
	}

}
