package com.gp.managers;

import encpslation.Event;

public class EvenManagerImpl2 implements EventManager {

	@Override
	public Event create(Long id) {
		// TODO Auto-generated method stub
		return new Event(id, "MacBook Launch", "new generation of MacBooks launch");
		
	}

}
