package prog2;

class FinancialCoordinator  {
	Account acctToManage;
	void createNewAccount(Employee e, double balance) {
	
		acctToManage  = new Account(e);
		try {
		acctToManage.setStartBalance(balance);
		}
		catch (LowBalanceExceptio excp) {
			System.out.println(excp.getMessage());
		}
	}
}
