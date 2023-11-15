package asignment3_1;

public enum AccountType {

	CHECKING("checking"), SAVINGS("savings"), RETIREMENT("retirement");

	AccountType(String s) {
		accountStatus = s;
	}

	
	 public String getStatus() { 
		 return accountStatus; 
		 }
	 private final String accountStatus;
	 
	/*
	 * public static void main(String[] args) { AccountType at =
	 * AccountType.SAVINGS; System.out.println(at.getStatus()); }
	 */
}
