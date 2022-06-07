package CallByReferenceConcepts;

public class Registration {

	private String firstName;
	private String lastName;
	private long phNo;
	private String city;
	private String eMail;

	// Created Constructor to avoid unnecessary object creation in mail method

	public Registration(String firstName, String lastName, long phNo, String city, String eMail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phNo = phNo;
		this.city = city;
		this.eMail = eMail;
	}

	// Created getter and Setter
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

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	public void doRegistration(Registration registration) {
		System.out.println(" The details are : "+" "+ registration.getFirstName() +" "+registration.getLastName()+" "+ registration.getPhNo()+
				                     " "+registration.getCity()+" "+registration.geteMail());
				                     

	}
}
