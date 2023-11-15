package lab3_2;

/**
 * @author 611092
 *
 */

import java.util.Scanner;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[4];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		emps[3] = new Employee("Haftom Gebreselassie", 2008, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
		emps[3].createNewChecking(30000);
		/*emps[3].createNewSavings(12600);
		emps[3].createNewRetirement(9000);	*/
		
//		for phase I - console output
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}
		else {
			//do nothing..the application ends here
			System.out.println("Thank you!");
		}				
	}
	String getFormattedAccountInfo() {
		
		String info = "";
		for(int i = 0; i < emps.length; ++i){
			info += (emps[i].getFormattedAcctInfo() + "\n");
		}
		return info;
	}
}


