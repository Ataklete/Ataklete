package prog2;

class Account {
	final double MIN_START_BAL = 20;
	Employee e;
	double balance;
	Account(Employee e) {
		this.e = e;
	}
	void setStartBalance(double balance) throws LowBalanceExceptio {
		if(balance < MIN_START_BAL) {
			throw new LowBalanceExceptio("Starting balance is too low");
			//System.out.println("Starting balance is too low");
		}
		else {
			this.balance = balance;
		}
	}
}
