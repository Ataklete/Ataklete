import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("type you name: ");
		System.out.println("you wrote: " + sc.nextLine());
		System.out.println("type your age: ");
		System.out.println("your age: " + sc.nextInt() );
		sc.close();

	}

}