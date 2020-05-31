package hashcode;

public class Passenger {

	private int id;
	private String firstName;
	public String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "passenger infor is "+this.firstName+"lastname "+this.lastName;//passenger infor is bblastname gg

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode(){
		//return id;
		return id+firstName.length()+firstName.length();
	}
	
	
}
