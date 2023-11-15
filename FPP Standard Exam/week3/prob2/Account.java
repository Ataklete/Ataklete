package week3.prob2;

class Account {
	final double MIN_START_BAL = 20;
	Employee e;
	double balance;
	Account(Employee e) {
		this.e = e;
	}
	void setStartBalance(double balance) {
		if(balance < MIN_START_BAL) {
			System.out.println("Starting balance is too low");
		}
		else {
			this.balance = balance;
		}
	}
}
