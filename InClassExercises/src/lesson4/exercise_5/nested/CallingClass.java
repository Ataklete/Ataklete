package lesson4.exercise_5.nested;

import lesson4.exercise_5.MyClass;

//inside secondpackage
public class CallingClass {
	public String readVal() {
		MyClass cl = new MyClass();
		//return cl.getVal(); //produces a compiler error -- more than one way to fix...
		return null;
	}
}


