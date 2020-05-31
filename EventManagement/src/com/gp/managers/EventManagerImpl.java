package com.gp.managers;

import encpslation.Event;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create(Long id) {
		// TODO Auto-generated method stub
		Event event = new Event(id,null,null);
		return event;
	}

}
