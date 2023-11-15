package prog3;

import java.util.Scanner;
//import prog2.employeeinfo.*;

public class Main {

	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		System.out.print("A. See a report of all accounts." + "\n" + "B. Make a deposite" + "\n"
				+ "C. Make a withdrawal. " + "\n" + "Make a selection (A/B/C)");

		String answer = sc.next();

		if (answer.equalsIgnoreCase("a")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		} else if (answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c")) {
			for(int i = 0; i < emps.length; i++) {
				System.out.println(i + ". " + emps[i].getName());
			}
			
			System.out.println("Select an employee: (Type a number)");
			int empIndex = sc.nextInt();
			
			System.out.println("0. checking" + "\n" + "1. savings" + "\n" + "2. retirement"
			+ "\n" + "Select an account: (Type a number)");
			int acctIndex = sc.nextInt();
			
			if(answer.equalsIgnoreCase("b")) {
				System.out.println("Deposite amount: ");
				int depositAmount = sc.nextInt();
				emps[empIndex].deposit(acctIndex, depositAmount);
			}
			
			if(answer.equalsIgnoreCase("c")) {
				System.out.println("Withdraw amount: ");
				int withdrawAmount = sc.nextInt();
				emps[empIndex].withdraw(acctIndex, withdrawAmount);
			}
			
			sc.close();
		} else {
			System.out.println("Invalid entry, Good Bye!");
			System.exit(0);
		}

	}

	String getFormattedAccountInfo() {
		String formatedInfo = "";
		for (Employee e : emps) {
			formatedInfo = formatedInfo + e.getFormattedAcctInfo() + "\n";
		}
		return formatedInfo;
	}

}
