package prog3;

public abstract class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;

	Account(Employee emp, double balance) {
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	public abstract AccountType getAccountType();

	public void makeDeposit(double deposit) {
		balance = balance + deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(balance >= amount) {
			balance = balance - amount;
			return true;
		}
		return false;
	}
	
	public double getBalance() {
		return balance;
	}
	
}
