package EmpAccount;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	
	private String name;
	private double salary;
	private Date hireday; 
	
	Employee(String name, double salary, int aYear, int aMonth, int aDay){
		this.name = name;
		this.salary = salary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth, aDay);
		hireday = cal.getTime();
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireday() {
		return (Date) hireday.clone();
	}
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireday=" + hireday + "]";
	}

	public void setHireday(Date hireday) {
		this.hireday = hireday;
	}
	
	
	

}
