package lesson4.exercise_7;


/** Implementation of Manager using Compostion instead of Inheritance.
 *  Now we can't use Manager in context of polymorphism, but it can
 *  support a different equals implementation.
 *  
 */
public final class ManagerComposition {
	private int bonus;
	Employee emp;

	public ManagerComposition(String name, int salary, int year, int month, int day) {
		emp = new Employee(name,salary);
		bonus = 0;
	}	
	public String getName() {
		return emp.getName();
	}
	public void setBonus(int b) {
		bonus = b;
	}
	
	public int getSalary() {
		return emp.getSalary();
	}
	
	@Override
	public boolean equals(Object ob) {
		if (ob == null) return false;
		if (ob.getClass() != getClass()) return false;
		ManagerComposition m = (ManagerComposition) ob;
		return (m.equals(this) && m.bonus == bonus);	
	}
	
	/** Override hashCode whenever you override equals */
	@Override
	public final int hashCode() {
		int result = 17;
		long bonusHashLong = Double.doubleToLongBits(bonus);
		int bonusHash = (int) (bonusHashLong ^ (bonusHashLong >>> 32));
		result = 31 * result + hashCode();
		result = 31 * result + bonusHash;
		return result;
	}
	
}
