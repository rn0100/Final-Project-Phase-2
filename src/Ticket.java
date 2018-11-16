
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Ticket extends Person{
	String incidence;
	int priority;
	String impact;
	String closingNotes;
	String techNotes;
	String updateNotes;
	public Ticket(String id, String name, String phoneNum, String email, String status, 
			String incidence, int priority, String impact, String closingNotes, String techNotes, String updateNotes)
	{
		super(id, name, phoneNum, email, status);
		this.incidence = incidence;
		this.priority = priority;
		this.impact = impact;
		this.closingNotes = closingNotes;
		this.techNotes = techNotes;
		this.updateNotes = updateNotes;
		
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
	public String getDateOpened()
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		return df.format(dateobj);
	}
	public String getDateClosed()
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		return df.format(dateobj);
	}
}



