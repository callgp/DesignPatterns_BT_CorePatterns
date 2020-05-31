package com.gp.commandlinearguments;

public class CommandLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length =args.length;
		if(length==0){
			System.out.println("no inputs");			
		}else{
			System.out.println("list of arguments");
			for(int i=0;i<length;i++){
				System.out.println(args[i]);
			}
		}

	}

}
