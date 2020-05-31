package com.gp.default_methods.multiple_inheritance;

public class B implements A,X {//gives error Duplicate default methods named m1 with the parameters () and () are inherited from the types X and A as both X and A has same m1 cannot overrode both

	public void m1(){
		System.out.println("hi");//once you override on your own error gone as it thinks B implemented its own way
	}
}
