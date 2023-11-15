package week3.prob2;

class FinancialCoordinator {
	Account acctToManage;
	void createNewAccount(Employee e, double balance) {
		acctToManage  = new Account(e);
		acctToManage.setStartBalance(balance);
	}
}
