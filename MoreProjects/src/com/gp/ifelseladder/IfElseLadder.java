package com.gp.ifelseladder;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice = "Check Balance";

		if (choice.equals("Check Balance")) {
			System.out.println("Check Balance");
		} else if (choice.equals("Change Pin")) {
			System.out.println("change pin");
		} else if (choice.equals("Withdraw Cash")) {
			System.out.println("Withdraw Cas");
		} else if (choice.equals("Deposit Check")) {
			System.out.println("Deposti Check");
		} else {
			System.out.println("timeout");
		}

	}

}
