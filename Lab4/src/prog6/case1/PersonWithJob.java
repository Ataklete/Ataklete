package prog6.case1;

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
	
}
