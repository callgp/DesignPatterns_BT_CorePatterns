package com.bharath.patterns.abstractFactory;

public class XMLDeptDao implements Dao {
	@Override
	public void save(){
		System.out.println("saving dept to xml");
	}

}
