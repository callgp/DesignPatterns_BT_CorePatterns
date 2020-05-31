package com.gp.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptions2 {
	
	void readFile() throws FileNotFoundException{
		
		//try{
			FileInputStream fis=new FileInputStream("");//if pass valid path of file it is ok
			/*}catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("file not found");
			}
			*/
			
		
	}
	
	public static void main(String[] args) {
		
CheckedExceptions2 ce=new CheckedExceptions2();
 try {
	ce.readFile();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	System.out.println("no file");
}
	}
}
