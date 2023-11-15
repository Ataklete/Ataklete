package prog5_5;

import java.util.Arrays;

public class StringSum {
	public void sum(String str) {
	
	char[] c = str.toCharArray();
	
	System.out.println("Sorted String = " + c.length);
	int count = 0;
	for (int i =0; i<=c.length/2; i++) {
		if (c[i]== '1'){
	       count++;
		System.out.println( (int)c[i] + (int)c[i+1]);
	
		}
		
	}
	System.out.println("Number of one's = " + count);
	}
	public static void main(String[] args) {
		
		String s = "00111111";
		StringSum  n = new StringSum();
		n.sum(s);

	}

}
