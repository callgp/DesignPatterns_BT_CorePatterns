package com.emc.entities2;

public class Event extends EMBase {
	
	/*public Long id;
	public String name;*/
	public String description;
	public String startDate;
	public String endTime;
	public Boolean started;
	
	public Event(Long id,String name, String description){
		this.id=id;
		this.name=name;
		this.description=description;
		
	}

}
