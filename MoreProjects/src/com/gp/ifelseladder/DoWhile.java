package com.gp.ifelseladder;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		do{
			
			if(x%2==0){
				System.out.println(x);
			}
			x++;
			//System.out.println("do");
		}while(x<=30);
		//System.out.println("after do while");//unreachable code

	}

}
