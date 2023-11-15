package prog6.case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;

	public PersonWithJob(String n, GregorianCalendar dob, double s) {
		super(n, dob);
		this.salary = s;
	}

	public double getSalary() {
		return salary;
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
		return p.getName().equals(this.getName()) && p.getDateOfBirth().equals(this.getDateOfBirth()) 
				&& p.getSalary() == this.getSalary();
	}

	
}
