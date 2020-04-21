package com.gp.patterns.command;

public class OnCommand implements Command {

	Televison television;
	
	public OnCommand(Televison television){
		this.television=television;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
     television.on();
	}

}
