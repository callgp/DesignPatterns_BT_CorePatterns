package com.gp.ifelseladder;

public class SwitchEx {

	public static void main(String[] args) {
		String choice="Check Balance";
		// TODO Auto-generated method stub
		switch(choice){
		case "Check Balance":
			System.out.println("check balance");
		case "Change Pin":
			System.out.println("change pin");
			
		case "Withdraw Cash":
			System.out.println("wc");
		case "Deposit Check":
			System.out.println("deposit check");
			
		default:
			System.out.println("time out default");
		}

	}

}
/*
without break prints everythig as below
check balance
change pin
wc
deposit check
time out default*/
