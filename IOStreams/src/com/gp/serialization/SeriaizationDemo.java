package com.gp.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeriaizationDemo {

	public static void main(String[] args) {
		
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos=new FileOutputStream("C:\\gpFolder\\gpJava\\Emp.ser");
			oos=new ObjectOutputStream(fos);
			
			Employee emp=new Employee(1,"gp",1000,12399);
			oos.writeObject((emp));
			System.out.println("emp obj serialized");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

//under C:\gpFolder\gpJava i see Emp.ser is generated
