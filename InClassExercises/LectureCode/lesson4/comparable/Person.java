package lesson4.comparable;

public class Person {
	private String name;

	public Person(String n) {
		name = n;
	}
	public String getName() {
			return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
