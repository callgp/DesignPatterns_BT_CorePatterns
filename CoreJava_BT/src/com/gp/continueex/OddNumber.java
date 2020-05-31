package com.gp.continueex;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++){
			if(i%2==0){
				continue;//for even numbers it wil continue to for loop directly for next number without going to below sysout
			//The main difference between break and continue is that break is used for immediate termination of loop. On the other hand, 'continue' terminate the current iteration and resumes the control to the next iteration of the loop
			}
			System.out.println("odd nbr is"+i);
		}

	}

}
