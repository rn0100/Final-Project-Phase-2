
public class Technician extends Person{
	String hireDate;
	boolean isSupervisor;
	
	String contents;
	public Technician(String id, String name, String phoneNum, String email, String status,
			String hireDate, boolean isSupervisor, String contents)
	{
		super(id, name, phoneNum, email, status);
		this.hireDate = hireDate;
		this.isSupervisor = isSupervisor;
		this.contents = contents;

	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public boolean isSupervisor() {
		return isSupervisor;
	}

	public void setSupervisor(boolean isSupervisor) {
		this.isSupervisor = isSupervisor;
	}
}



