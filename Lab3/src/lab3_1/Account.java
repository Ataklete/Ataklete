/**
 * 
 */
package lab3_1;

/**
 * @author 611092
 *
 */
public class Account {

	AccountType accountType;
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;
	
	public double getBalance() {
		return balance;
	}
	
	public String getAcctType() {
		return acctType;
	}	
	
	Account(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	/*public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}*/
	
	// Mine 
	public String toString() {
		return employee +",  " + "type = " + acctType + ", balance = " + balance;
	}
	
	public void makeDeposit(double deposit) {
		// implement
		this.balance += deposit;
	}
	
	public boolean makeWithdrawal(double amount) {
		// implement
		if(amount >= balance) {
			System.out.println("Sorry, insufficient fund!");
			return false;
		}
		this.balance -= amount;
		System.out.println("Balance = " + this.balance);
		return true;
	}
}
