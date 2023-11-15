package mock2_2;



public class Contractor extends Employee {
	


public Contractor(String name, double salary, int aYear, int aMonth,int aDay) {
	super(name,salary,aYear,aMonth,aDay);
	
	}
double overtimeHours=0;

public double getOvertimeHours() {
	return overtimeHours;
}
public void setOvertimeHours(double overtimeHours) {
	this.overtimeHours = overtimeHours;
}


@Override
public double computeSalary() {
	double newSalary = super.computeSalary();
	return (newSalary + (12*overtimeHours));
}


}

