package lab2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		
		boolean isPrime = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();

		
		//if(num>=2 )
			if (num % 2 == 0 && num!=2){
			
			  isPrime=false; 
			
			  }
			  
			  if (isPrime)
			  {
				System.out.println(num + " is a prime number.");
			} else
				System.out.println(num + " not a prime number.");

	}

}
