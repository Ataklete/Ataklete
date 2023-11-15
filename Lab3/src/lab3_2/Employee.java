package lab3_2;

/**
 * @author 611092
 *
 */

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
		
	}

	public void deposit(AccountType acctType, double amt){
		switch(acctType){
			case CHECKING:
				checkingAcct.makeDeposit(amt);
				break;
			case SAVINGS:
				savingsAcct.makeDeposit(amt);
				break;
			case RETIREMENT:
				retirementAcct.makeDeposit(amt);
				break;
			default:				
		}
	}
	
	public boolean withdraw(AccountType acctType, double amt){
		switch(acctType){
		case CHECKING:
			return checkingAcct.makeWithdrawal(amt);
			
		case SAVINGS:
			return savingsAcct.makeWithdrawal(amt);
			
		case RETIREMENT:
			return retirementAcct.makeWithdrawal(amt);
			
		default:
			return false;				
		}
	}

	
	public String getFormattedAcctInfo() {
		String infoString = "ACCOUNT INFO FOR " + name + "\n" + "\n";
		
		if(checkingAcct != null) 
			infoString += checkingAcct.toString() + "\n";
		
		if(savingsAcct != null)
			infoString += savingsAcct.toString()+ "\n";
		
		if(retirementAcct != null)
			infoString += retirementAcct.toString()+ "\n";
		
		return infoString;
	}	
	
}

