package com.gp.ifelseladder;

public class SwitchExWithBreak {

	public static void main(String[] args) {
		String choice="Check Balance";
		// TODO Auto-generated method stub
		switch(choice){
		case "Check Balance":
			System.out.println("check balance");
			break;
		case "Change Pin":
			System.out.println("change pin");
			break;
		case "Withdraw Cash":
			System.out.println("wc");
			break;
		case "Deposit Check":
			System.out.println("deposit check");
			break;
		default:
			System.out.println("time out default");//this could be at first also no difference
		}

	}

}
//with break only prints check balance and breaks from loop
/*
without break prints everythig as below
check balance
change pin
wc
deposit check
time out default*/
