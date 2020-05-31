package com.gp.forex;

public class ForBreakLabelledBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		
		/*for(int i=1;i<=20;i++){
			System.out.println(i);
		}

		
		
		for(int i=20;i>=1;i--){
			System.out.println(i);
		}*/
		
		
		l1:
		{
			System.out.println("block begins");
			
			if(x==20){
				break l1;
			}
			System.out.println("block ends");//never prints this as breaks l1
		}
		System.out.println("outside the block");

	}

}
