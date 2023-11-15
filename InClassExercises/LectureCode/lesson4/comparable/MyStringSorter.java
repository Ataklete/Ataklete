package lesson4.comparable;

import java.util.Arrays;
public class MyStringSorter implements Comparable<MyStringSorter> {
	private String aString;
	MyStringSorter(String s) {
		aString = s;
	}
	@Override
	public String toString() {
		return aString;
	}
	@Override
	public int compareTo(MyStringSorter s) {
		if(aString.charAt(0) > s.aString.charAt(0)) {
			return 1;
		} else if (aString.charAt(0) < s.aString.charAt(0)) {
			return -1;	
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		MyStringSorter[] MyStrings = {
				new MyStringSorter("Design Patterns"),	
				new MyStringSorter("MPP"),
				new MyStringSorter("Algorithms")};
		
		Arrays.sort(MyStrings);
		System.out.println(Arrays.toString(MyStrings));
	}
}
