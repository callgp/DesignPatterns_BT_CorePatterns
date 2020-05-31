package com.gp.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\gpFolder\\gpJava\\Emp.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Object readObject = ois.readObject();
			
			Employee emp=(Employee)readObject;
			
			System.out.println("id"+emp.id);
			System.out.println("name"+emp.name);
			System.out.println("sal"+emp.salary);
			System.out.println("ssn"+emp.ssn);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}

/*
id1
namegp
sal1000.0
ssn0*/

