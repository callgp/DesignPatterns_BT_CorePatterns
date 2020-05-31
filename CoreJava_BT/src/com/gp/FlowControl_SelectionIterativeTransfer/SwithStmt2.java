package com.gp.FlowControl_SelectionIterativeTransfer;

public class SwithStmt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;//int byte short char int enum

		switch (x) {

		case 1:
			//System.out.println("case 1");
			//break;//if no break falls through to next until sees break

		case 2:
			//System.out.println("Case 2");
			System.out.println("common logic");//common logic for 1 and 2
			break;
		default:
			System.out.println("default");
		}

	}

}
