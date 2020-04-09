package com.bharath.patterns.abstractFactory;

public class DBDeptDao implements Dao {
	@Override
	public void save(){
		System.out.println("saving dept to db");
	}

}
