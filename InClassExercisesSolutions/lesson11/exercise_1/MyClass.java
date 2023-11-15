package lesson11.exercise_1;

public class MyClass {
	private int val;
	public MyClass(int x) {
		val = x;
	}
	public int getVal() {
		return val;
	}
	@Override
	public int hashCode() {
		return 2;
	}
	@Override
	public String toString() {
		return "MyClass object #" + val;
	}
}
