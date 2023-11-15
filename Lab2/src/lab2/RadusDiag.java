package lab2;
import java.lang.Math.*;
import java.util.Scanner;
public class RadusDiag {

	public static void main(String[] args) {
		int read;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter Radius:");
		read = r.nextInt();
		double A = 2 * Math.pow(read, 2);
		
		System.out.println("Circle Area is = " + A);
		
		Scanner len = new Scanner(System.in);
		Scanner width = new Scanner(System.in);
		System.out.println("Enter Length: ");
		int c = len.nextInt();
		System.out.println("Enter Width: ");
				int d = width.nextInt();
		int diag = c * d;
		System.out.println("diagonal is = " + diag);
		
		
		
	}
	
}
