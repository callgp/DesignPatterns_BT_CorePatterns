package com.gp.patterns.command;

public class OffCommand implements Command {

	Televison television;
	
	public OffCommand(Televison television){
		this.television=television;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
     television.off();
	}

}
