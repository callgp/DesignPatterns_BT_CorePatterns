package com.gp.overriding;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent.doSomething();
		//Child.doSomething();
		
		/*parent method
		child method*/


		Parent p=new Parent();
		System.out.println(p.s);
		
		Child c=new Child();
		System.out.println(c.s);
		
		Parent c1=new Child();
		System.out.println(c1.s);//unlike method overriding runtime polymorphism child invoke...for variable resoltion happen at compile time so reverse..so 
	//parent variable is bound that shows here
		System.out.println("here  "+ c1.doSomething("helo"));//called child method
		
		/*parent
		child
		parent
		child method
		herehelo*/

	}

}
