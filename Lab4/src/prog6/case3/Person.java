package prog6.case3;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;

	public Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}

	public String getName() {
		return name;
	}

	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) {
			return false;
		}
		if(!(aPerson instanceof Person)) {
			return false;
		}
		Person p = (Person) aPerson;
		return p.getName().equals(this.getName()) && p.getDateOfBirth().equals(this.getDateOfBirth());
	}

}