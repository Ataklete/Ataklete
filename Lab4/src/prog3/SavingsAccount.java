package prog3;

public class SavingsAccount extends Account {
	
	private final double MONTHLY_INTEREST = 0.25;
	
	SavingsAccount(Employee emp, double startAmount){
		super(emp, startAmount);
	}
	
	@Override
	public AccountType getAccountType() {
		return AccountType.SAVINGS;
	}
	
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance + (MONTHLY_INTEREST * baseBalance);
	}
	
	@Override
	public String toString() {
		String result = String.format(" %2s %5s %n %2s $%.2f"
				, "Account type:", this.getAccountType()
				, "Current balance:", super.getBalance());
		return result;
	}

}
