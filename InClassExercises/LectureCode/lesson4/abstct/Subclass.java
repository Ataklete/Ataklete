package lesson4.abstct;

public abstract class Subclass extends MyClass {
	protected abstract int num();
	
	protected String protectedMethod() {
		return "In Subclass";
	}
}
