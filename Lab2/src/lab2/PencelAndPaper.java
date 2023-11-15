package lab2;
import java.util.Scanner;

public class PencelAndPaper {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age to find eligibility");
		int age = scan.nextInt();
		String socialSecurityStatus = (age > 65) ? "eligible":"ineligible";
		System.out.println(socialSecurityStatus);
		
		
		String s = "a friendly face";
		
	System.out.println(s.charAt(2));
	System.out.println(s.length());
	System.out.println(s.substring(2,9));
	System.out.println(s.substring(4));
	 
	
	}
}
