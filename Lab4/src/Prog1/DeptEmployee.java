package Prog1;

import java.time.LocalDate;


public class DeptEmployee {
	
	private String name;
	private LocalDate hireDate;
	protected double salary;
	
	public DeptEmployee (String ename, double esalary, int eyear, int emonth, int edate) {	
		this.name = ename;
		this.salary = esalary;
		this.hireDate = LocalDate.of(eyear, emonth, edate);		
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name ) {
		this.name = name;
	}
	
	public double computeSalary() {
		return salary;
	}


}
