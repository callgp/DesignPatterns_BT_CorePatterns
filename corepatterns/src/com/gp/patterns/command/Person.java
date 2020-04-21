package com.gp.patterns.command;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televison television=new Televison();
		
		RemoteControl remoteControl=new RemoteControl();
		
		OnCommand onCommand=new OnCommand(television);
		
		remoteControl.setCommand(onCommand);
		remoteControl.pressButton();
		
		//Televison television=new Televison();
		
		OffCommand offCommand=new OffCommand(television);
		remoteControl.setCommand(offCommand);
		remoteControl.pressButton();
		

	}

}
