package com.emc.entities2;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class TestEntities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Organizer organizer=new Organizer();
		organizer.id=123l;
		organizer.name="Aple Inc";
		System.out.println(organizer);
		System.out.println(organizer.name);
		
		Event event=new Event(456l, "IPhone 100 Launch", "grand launch");
		/*event.id=456l;
		event.name="IPhone 100 Launch";
		event.description="grand launch";*/
		System.out.println(event.description);
		
		
	}

}
