package encpslation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Organizer organizer=new Organizer();
		organizer.setId(123l);
		organizer.setName("Aple Inc");
		System.out.println(organizer);
		System.out.println(organizer.getName());
		
		Event event=new Event(456l, "IPhone 100 Launch", "grand launch");
		/*event.id=456l;
		event.name="IPhone 100 Launch";
		event.description="grand launch";*/
		System.out.println(event.getDescription());
		
		
	}

}
