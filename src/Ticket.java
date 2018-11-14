

public class Ticket extends Person{
	String incidence;
	int priority;
	String impact;
	public Ticket(String id, String name, String phoneNum, String email, String status, 
			String incidence, int priority, String impact)
	{
		super(id, name, phoneNum, email, status);
		this.incidence = incidence;
		this.priority = priority;
		this.impact = impact;
		
	}
	public String getIncidence() {
		return incidence;
	}
	public void setIncidence(String incidence) {
		this.incidence = incidence;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getImpact() {
		return impact;
	}
	public void setImpact(String impact) {
		this.impact = impact;
	}
}


