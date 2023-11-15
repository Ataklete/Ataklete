package lesson4.exercise_5.nested;

import lesson4.exercise_5.MyClass;

public class CallingClass {
	public static String readVal() {
		MyClass cl = new MyClass();
		return cl.getVal();
	}
	public static void main(String[] args) {
		System.out.println(readVal());
	}
}
