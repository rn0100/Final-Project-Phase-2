
public class SoftwareTickets extends Ticket
{
	String opSystem;
	String type;
	public SoftwareTickets(String id, String name, String phoneNum, String email, String status, 
			String incidence, int priority, String impact, String opSystem, String type)
	{
		super(id, name, phoneNum, email, status, incidence, priority, impact);
		this.opSystem = opSystem;
		this.type = type;
		
	}
	public String getOpSystem() {
		return opSystem;
	}
	public void setOpSystem(String opSystem) {
		this.opSystem = opSystem;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
