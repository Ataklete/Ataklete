package prog3;

public class CheckingAccount extends Account {
	
	private final double MONTHLY_CHARGE = 5.00;
	
	CheckingAccount(Employee emp, double startAmount) {
		super(emp, startAmount);
	}
	
	@Override
	public AccountType getAccountType() {
		return AccountType.CHECKING;
	}
	
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance - MONTHLY_CHARGE;
	}
	
	@Override
	public String toString() {
		String result = String.format(" %2s %5s %n %2s $%.2f"
				, "Account type:", this.getAccountType()
				, "Current balance:", super.getBalance());
		return result;
	}

}
