package mock2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	
	private String firstname;
	private String middleName;
	private String lastName;
	private Date birthDate;
	private String SSN;
	private double salary;
	//private Position pos;
	public Employee(String firstname, String middleName, String lastName,String ssn, double salary,  int aYear, int aMonth, int aDay) {
		//super();
		this.firstname = firstname;
		this.middleName = middleName;
		this.lastName = lastName;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth, aDay);
		
		this.birthDate = cal.getTime();
		this.SSN = ssn;
		this.salary = salary;
		//this.pos =pos;
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return (Date)birthDate.clone();
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", birthDate=" + birthDate + "]";
	}
	

}
