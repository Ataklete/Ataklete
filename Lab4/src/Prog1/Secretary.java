package Prog1;



public class Secretary extends DeptEmployee {
	
	
	
	public Secretary(String ename, double esalary, int eyear, int emonth, int edate) {
		super(ename, esalary, eyear, emonth, edate);
		
	}

	double overtimeHours;
	
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
