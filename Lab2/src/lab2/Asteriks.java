package lab2;

public class Asteriks {

	public static void main(String[] args) {
		for (int i=0; i<=5; i++) {
			for (int j=0; j<i; j++)
				System.out.printf("%-3s", "*");
			System.out.println();
		}
		
	}

}
