package lesson1.exercise_1;

import java.util.Arrays;

public class MyClass {
	public static void main(String[] args) {
		int[] arr = {2, 5, -3, 11, 1};
		int product = product(arr);
		System.out.println("The product of the values in {2, 5, -3, 11, 1} is " + product);
		System.out.println("A printout of the array of integers is " + Arrays.toString(arr));
		String[] arr2 = {"A", "L", "M", "O", "S", "T", " ", "D", "O", "N", "E"};
		String con = concat(arr2);
		System.out.println("Concatenating the strings in arr2 gives us: " + con);
		
	}
	
	static int product(int[] arr) {
		int prod = 1;
		int len = arr.length;
		for(int i = 0; i < len; ++i) {
			prod = prod * arr[i];
		}
		return prod;
	}
	
	static String concat(String[] arr) {
		String s = "";
		int len = arr.length;
		for(int i = 0; i < len; ++i) {
			s = s + arr[i];
		}
		return s;
	}
}
