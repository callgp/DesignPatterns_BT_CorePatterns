package encpslation;

public class Event extends EMBase {
	
	/*public Long id;
	public String name;*/
	private String description;
	private String startDate;
	private String endTime;
	private Boolean started;
	
	public Event(Long id,String name, String description){
		this.id=id;
		this.name=name;
		this.description=description;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Boolean getStarted() {
		return started;
	}

	public void setStarted(Boolean started) {
		this.started = started;
	}

}
