
public class Customer {
	private String firstName;
	private String lastName;
	private String creditCard;
	
	public String getFirstName(){//data private so only through public method can access
		return firstName;
	}
	
	public void setFirstName(String firstName){
		if(firstName==null){
			System.out.println("invalid first name");
		
		}
		this.firstName=firstName;
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

}
