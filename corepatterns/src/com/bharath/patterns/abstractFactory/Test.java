package com.bharath.patterns.abstractFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoAbstractFactory daf = DaoFactoryProducer.produce("xml");
	Dao dao = daf.createDao("dept");

	dao.save();
	}

}
