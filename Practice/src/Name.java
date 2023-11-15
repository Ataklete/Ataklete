import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str = "Ataklete";

		
			System.out.println("Enter your Name");
			Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			int count = 0;
			for ( int i=0; i<=str1.length(); i++) {
			if (str1.charAt(i) == 'e') {
				count++;
			}
			System.out.println(count);
			sc.close();
		}
			
	
	}
}
