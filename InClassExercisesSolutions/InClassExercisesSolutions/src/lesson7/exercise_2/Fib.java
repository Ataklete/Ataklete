package lesson7.exercise_2;

import java.util.Arrays;

public class Fib {
	int[] store;
	
	public int fib(int n) {
		store = new int[n+1];
		store[0] = 0;
		store[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			store[i] = store[i-1] + store[i-2];
		}
		return store[n];	
	}
	
	public static void main(String[] args) {
		Fib f = new Fib();
		System.out.println(f.fib(10));
		System.out.println("\n" + Arrays.toString(f.store));
	}
}
