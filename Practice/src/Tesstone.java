import java.io.Console;
import java.util.Scanner;
import java.util.StringJoiner;


public class Tesstone {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("Type your name: ");
		 * System.out.println("you wrote: " + sc.nextLine());
		 * System.out.print("Type your age: "); System.out.println("your age: " +
		 * sc.nextInt()); sc.close();
		 */
		/*
		 * StringJoiner sj = new StringJoiner(":", "[", "]");
		 * sj.add("George").add("Sally").add("Fred"); String desiredString =
		 * sj.toString(); System.out.println(desiredString);
		 */

		/*
		 * Scanner sc = new Scanner(System.in); while(true) {
		 * System.out.println("Enter a positive number: "); int value = sc.nextInt();
		 * if(value <= 0){ break; } }
		 * System.out.println("The value you enter must be positive.");
		 */

//*******************************************************************************	
		/*
		 * for(int i = 0; i < 5; ++i){ for(int j = 5; j >i; --j){
		 * System.out.printf("%-3s","*");
		 * 
		 * } System.out.println(); }
		 */
		
		/*
		 * Console cons = System.console(); String userName =
		 * cons.readLine("User Name: " ); char [] passwd =
		 * cons.readPassword("Password: "); System.out.println(userName);
		 * System.out.println(passwd);
		 */
		  
		  int len = 0; 
		  if(args != null)
			  len = args.length; 
		  for(int i = 0; i < len; ++i) { 
			  System.out.println("position " + i + ": " + args[i]);
		  }

	}

}
