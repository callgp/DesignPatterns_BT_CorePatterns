package com.gp.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptions {
	
	public static void main(String[] args) {
		

	try{
	FileInputStream fis=new FileInputStream("");//if pass valid path of file it is ok
	}catch (FileNotFoundException e) {
		// TODO: handle exception
		System.out.println("file not found");
	}
	
	}
}
