import com.sun.java_cup.internal.runtime.Scanner;

public class Scann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (system.in);
		System.out.println("type you name: ");
		System.out.println("you wrote: " + sc.nextLine());
		System.out.println("type your age: ");
		System.out.println("your age: " + sc.nextInt() );
		sc.close();
	}

}
