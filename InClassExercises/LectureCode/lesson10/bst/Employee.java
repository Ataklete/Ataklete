package lesson10.bst;

/**
 * Represents profile information for an Employee.
 * 
 * @author pcorazza
 */
public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	public Employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	//default constructor
	public Employee() {
		this("_Placeholder","Employee");
	}
	
	/** Provides a string representation of this Employee */
	public String toString() {
		return "[" + firstName + " " + lastName + "]";
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
