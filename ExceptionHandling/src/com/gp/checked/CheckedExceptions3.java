package com.gp.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptions3 {
	
	void readFile() throws FileNotFoundException{
		
		//try{
			FileInputStream fis=new FileInputStream("");//if pass valid path of file it is ok
			/*}catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("file not found");
			}
			*/
			
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {//instead of handling exception implementation here can throw to jvm
		
CheckedExceptions3 ce=new CheckedExceptions3();
 //try {
	ce.readFile();
/*} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	System.out.println("no file");
}*/
	}
}
