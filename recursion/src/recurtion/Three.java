package recurtion;

public class Three {
	
	public static int sum(int n) {
		if (n==0)
			return 0;
		return n % 10 + sum(n / 10);	
	}

	public static void main(String[] args) {
		       
       System.out.println("Sum of 12345 : " + sum(12345));
       System.out.println("Sum of 45632 : "  + sum(45632));
	}

}
