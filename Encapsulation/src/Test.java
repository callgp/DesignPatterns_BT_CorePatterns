
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c=new Customer();
		c.setFirstName(null);
		c.setLastName("gg");
		c.setCreditCard("112");
		System.out.println(c.getFirstName());
		System.out.println(c.getLastName());
		System.out.println(c.getCreditCard());
		
	/*	invalid first name//encapsulation helps validation of data also//user wont see what we are changing in getters and setters and easy to maintain
		null
		gg
		112*/

	}

}
