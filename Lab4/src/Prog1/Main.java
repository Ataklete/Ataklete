package Prog1;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Professor prof1 = new Professor("Smith", 100000, 1985,11, 11);
		Professor prof2 = new Professor("Tom", 90000, 1988, 11, 11);
		Professor prof3 = new Professor("Brad", 110000, 1986, 8, 1);
		Secretary sec1 = new Secretary("Jhon", 50000, 1983, 2, 25);
		Secretary sec2 = new Secretary("Susan", 60000, 1989, 12, 7);
		
		prof1.setNumberOfPublications(10);
		prof2.setNumberOfPublications(10);
		prof3.setNumberOfPublications(10);
		
		sec1.setOvertimeHours(200);
		sec2.setOvertimeHours(200);
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = sec1;
		department[4] = sec2;
		
		double totalSalary = 0;
		Scanner ask = new Scanner(System.in);
		System.out.println("Do you want to see Total Salary? Y/N");
		String input = ask.next();
		ask.close();
		if (input.equals("Y")||input.equals("y")) {
			for (DeptEmployee emp:department) {
				totalSalary += emp.computeSalary();
			}
			System.out.println(totalSalary);
		} else if (input == "N" || input == "n") System.out.println("You Replied No");
		else System.out.println("Invalid Input");
		
	}

}
