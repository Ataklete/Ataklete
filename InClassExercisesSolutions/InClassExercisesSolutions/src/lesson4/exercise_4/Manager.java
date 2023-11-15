package lesson4.exercise_4;

import java.time.LocalDate;
import java.util.Date;


/** Implementation of Manager using Compostion instead of Inheritance.
 *  Now we can't use Manager in context of polymorphism, but it can
 *  support a different equals implementation.
 *  
 */
public final class Manager extends Employee {
	private int bonus;

	public Manager(String name, int salary, int year, int month, int day) {
		super(name,salary);
		bonus = 0;
	}	
	public String getName() {
		return getName();
	}
	public LocalDate getHireDay() {
		return getHireDay();
	}
	public void setBonus(int b) {
		bonus = b;
	}
	
	@Override
	public boolean equals(Object ob) {
		if (ob == null) return false;
		if (ob.getClass() != getClass()) return false;
		Manager m = (Manager) ob;
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
