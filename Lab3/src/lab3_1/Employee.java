/**
 * 
 */
package lab3_1;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private double salary;
	private Date hireDay;

	// constructor
	Employee(String name, double aSalary, int aYear,
			int aMonth, int aDay) {
		this.name = name;
		
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}
	

	public double getSalary() {
		return salary;
	}
	// needs to be improved
	/*public Date getHireDay() {
		return hireDay;
	}*/
	
	public Date getHireDay() {
		return (Date)hireDay.clone();
	}
	// or we can use Date & time java 8
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	/*private String format = "name = %s, salary = %.2f, hireDay = %s";*/
	private String format = "name = %s, salary = %.2f, hireDay = %s";
	
	public String toString() {
		return String.format(format, name, salary, Util.dateAsString(hireDay));
	}
}
