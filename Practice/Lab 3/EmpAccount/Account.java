package EmpAccount;



public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	//private double accType;
	private AccType accType;
	private String accountType;
	private Employee emp;
	 Account(Employee emp, AccType accType, double balance) {
		//super();
		this.balance = balance;
		this.accType = accType;
		this.emp = emp;
	}
	
	
	/*
	 * Account(Employee emp, String acctType) { this(emp, acctType,
	 * DEFAULT_BALANCE); }
	 */
	public void makeDeposit(double amount) {
		this.balance+=amount;
	}
	public boolean makeWithdrowal(double amount) {
		if ( amount>=balance ) {
			System.out.println("insufficent balane ");
		return false;
	}
		else {
			balance-=amount;
			System.out.println(this.balance);
		return true;
		}
	}	
	public double getBalnce() {
		return balance;
	}
	public void setBalnce(double balnce) {
		this.balance = balnce;
	}
	public AccType getAccType() {
		return accType;
	}
	public void setAccType(AccType accType) {
		this.accType = accType;
	}
	
	
	public static double getDefoultBalance() {
		return DEFAULT_BALANCE;
	}
	public String toString() {
		return emp +",  " + "type = " + accountType + ", balance = " + balance;
	}
	
	

}
