package prog3;

import java.time.LocalDate;
//import prog2.AccountList;
//import exercise3.MyStringList;
 class Employee {
	
	private AccountList accounts;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList(); 
	}

	public void createNewChecking(double startAmount) {
		Account checkingacct = new CheckingAccount(this, startAmount);
		accounts.add(checkingacct);
	}

	public void createNewSavings(double startAmount) {
		Account savingsacct = new SavingsAccount(this, startAmount);
		accounts.add(savingsacct);
	}

	public void createNewRetirement(double startAmount) {
		Account retirementacct = new RetirementAccount(this, startAmount);
		accounts.add(retirementacct);
	}

	public String getFormattedAcctInfo() {
		String accountInfo = "\nACCOUNT INFO FOR: " + getName() + "\n";
		return accountInfo + this.getNamesOfAccounts();
	}

	public void deposit(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		if(selected != null) {
			selected.makeDeposit(amt);
			System.out.printf("$%.2f %2s %2s %2s %2s %n"
					, amt, "has been deposited in the\n", selected.getAccountType()
					, "account of", getName());
		} else {
			System.out.println("Incorrect amount, try with correct amount, Bye!");
		}
	}

	public boolean withdraw(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		if (selected != null) {
			selected.makeWithdrawal(amt);
			System.out.printf("$%.2f %2s %2s %2s %2s %n"
					, amt, "has been deducted from the\n", selected.getAccountType()
					, "account of", getName());
			return true;
		} 
		
		System.out.println("Incorrect amount, try with correct amount, Bye!");
		return false;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public String getNamesOfAccounts() {
		MyStringList str = new MyStringList();
		for(Account list: accounts.getAccounts()) {
			if(list != null)
				str.add(list.toString());
		}
		return str.toString();
	}

}
