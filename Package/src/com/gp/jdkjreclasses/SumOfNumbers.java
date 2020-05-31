package com.gp.jdkjreclasses;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = Integer.parseInt(scanner.next());
		int num2 = Integer.parseInt(scanner.next());
		
		int result=num1+num2;
		System.out.println("sum is  "+result);
		
	}

}
