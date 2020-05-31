package com.gp.assertion;

public class AssertionDemo {

	public static void main(String[] args) {
		int withdrawAmount=100;
		int currentBalance=10;//less or equal same assertion error
		
		assert(withdrawAmount<=currentBalance):"withdrawl amount more than current balance";
	}
}
