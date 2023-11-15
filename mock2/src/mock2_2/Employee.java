package mock2_2;

import java.util.Date;
import java.util.GregorianCalendar;
public class Employee {
    private String name;
    private double salary =0;
    

	private Date hiredate;
    
public Employee(String name, double salary, int aYear, int aMonth,int aDay) {
	//super();
	this.name = name;
	this.salary = salary;
	GregorianCalendar cal = new	GregorianCalendar(aYear, aMonth, aDay);
	this.hiredate = cal.getTime();
	}

public void setName(String name) {
	this.name = name;
}

public void setHiredate(Date hiredate) {
	this.hiredate = hiredate;
}

public String getName() {
	return name;
}

public double computeSalary() {
	return salary;
}

public Date getHiredate() {
	return (Date)hiredate.clone();
}
@Override
public String toString() {
	return "Employee [salary=" + salary + "]";
}

}