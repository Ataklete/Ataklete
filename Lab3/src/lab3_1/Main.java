/**
 * 
 */
package lab3_1;

/**
 * @author 611092
 *
 */
public class Main {
	public static void main(String[] args) {

		Employee emp1 = new Employee("Ati", 100000, 2020, 02, 01);
		Account accountSaving = new Account(emp1, AccountType.SAVINGS.getStatus(), 300);
		Account accounttChecking = new Account(emp1, AccountType.CHECKING.getStatus(), 300);
		Account actcountRetirement = new Account(emp1, AccountType.RETIREMENT.getStatus(), 300);
		System.out.println(accounttChecking);
		System.out.println(accountSaving);
		System.out.println(actcountRetirement);

		
		/*// Mine
		 
		 // Making withdrawal from saving account 
		 accountSaving.makeWithdrawal(100);
		 accountSaving.makeWithdrawal(200); 
		 accountSaving.makeWithdrawal(100); 
		 //Displaying of account type
		 System.out.println(accountSaving.getAcctType());*/
		 
	}
}
