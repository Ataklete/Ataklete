package prog2;

public class PersonWithJob  {
	private double salary;
	private Person person;

	
	public PersonWithJob( Person person,double salary) {
		super();
		this.salary = salary;
		this.person = person;
	}
//	public PersonWithJob( String n,double salary) {
//		person = new Person(n);
//		this.salary = salary;
//		//this.person = person;
//	}
	@Override
	public String toString() {
		return "PersonWithJob [salary=" + salary + ", person=" + person + "]";
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
		&& p.getSalary() == this.getSalary() ;
	}

	
}

