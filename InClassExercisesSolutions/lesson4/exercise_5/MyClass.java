package lesson4.exercise_5;

public class MyClass extends MySuperClass {
	
	//Makes the getVal of MySuperClass explicitly available
	@Override
	public String getVal() {
		return super.getVal();
	}
}
