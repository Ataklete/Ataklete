package prog3;

public class RetirementAccount extends Account {
	
	private final double PENALITY = 0.2/100;
	
	RetirementAccount (Employee emp, double startAmount){
		super(emp, startAmount);
	}
	
	@Override
	public AccountType getAccountType() {
		return AccountType.RETIREMENT;
	}
	
	@Override
	public boolean makeWithdrawal(double amount) {
		double baseBalance = super.getBalance();
		if(amount <= baseBalance) {
			super.makeWithdrawal(amount + (amount * PENALITY));
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String result = String.format(" %2s %5s %n %2s $%.2f"
				, "Account type:", this.getAccountType()
				, "Current balance:", super.getBalance());
		return result;
	}
	
}
