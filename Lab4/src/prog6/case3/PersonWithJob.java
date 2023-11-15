package prog6.case3;

import java.util.GregorianCalendar;

public class PersonWithJob  {
	private double salary;
	private Person person;

	public PersonWithJob(String n, GregorianCalendar dob, double s) {
		person = new Person(n, dob);
		this.salary = s;
	}

	public double getSalary() {
		return salary;
	}
	//@Override
	public Person getPerson() {
		return person;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) {
			return false;
		}
		if(!(aPerson instanceof PersonWithJob)) {
			return false;
		}
		PersonWithJob p = (PersonWithJob) aPerson;
		return person.equals(p.getPerson()) 
				&& p.getSalary() == this.getSalary();
	}

	
}
