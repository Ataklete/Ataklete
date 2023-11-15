package EmpAccount;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("Ati", 100000, 2020, 02, 01);
		Account accountSaving = new Account(emp1, AccType.SAVINGS, 300);
		Account accountRetirement =new Account(emp1, AccType.RETIREMENT, 300);
		Account accountChecking = new Account(emp1, AccType.CHECKING, 300);
		System.out.println(accountSaving);
		System.out.println(accountRetirement);
		System.out.println(accountChecking);
		
	}

}
