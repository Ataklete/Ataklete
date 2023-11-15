package prog2;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
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
		return p.getName().equals(this.getName()) ;
	}
}
