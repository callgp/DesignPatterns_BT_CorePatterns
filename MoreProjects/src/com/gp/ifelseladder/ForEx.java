package com.gp.ifelseladder;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<10;i++){//all optional here initialization conditional iccremental
			System.out.println(i);
		}*/
		
		/*int i = 0;//this is fine
		for(;i<10;i++){//all optional here initialization conditional iccremental
			System.out.println(i);
		}*/
		int i = 0;//compile ok..but when run infinity loop
		for(;;){//all optional here initialization conditional iccremental
			System.out.println(i);
		}
		
	}

}
