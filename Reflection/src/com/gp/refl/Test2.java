package com.gp.refl;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class<?> forName = Class.forName(Calculator.class.getName());
			System.out.println(forName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
// class com.gp.refl.Calculator ..class loaded to memory

