package com.gp.ShortCutOperator;

public class ShortCutOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x=true;
		boolean y=false;
		if(x&&y){
			System.out.println("insie if");//wont print both & , && cases ..shortcut works with boolean only not int etc like bitwise operators..second arg is optional
		}else if(x|y){
			System.out.println("inside else if");//prints for |,|| cases..if first true wont evaluate 2nd in ase of || shortcut or
		}

	}

}
