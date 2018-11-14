
public abstract class Person {
	String id;
	String name;
	String phoneNum;
	String email;
	String status;
	public Person(String id, String name, String phoneNum, String email, String status)
	{
		this.id = id;
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString()
	{
		return ("ID Number: " + id + "\nName: " + name + "\nPhone Number: " + phoneNum
				+ "\nEmail: " + email + "\nStatus: " + status);
	}
	
}

