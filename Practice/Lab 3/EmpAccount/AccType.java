package EmpAccount;

public enum AccType {
	
CHECKING("checking"),SAVINGS ("savings"),RETIREMENT ("retirement");
	
	AccType(String s){
		accountStatus = s;
	}
	
	
	public String getStatus() {
		return accountStatus;
	}
	private final String accountStatus;
	
}