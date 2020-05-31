package encpslation;

public class Participant extends EMBase {
/*	public Long id;
	public String name;*/
	private String email;
	private Boolean chekedIn;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getChekedIn() {
		return chekedIn;
	}
	public void setChekedIn(Boolean chekedIn) {
		this.chekedIn = chekedIn;
	}
	

}
