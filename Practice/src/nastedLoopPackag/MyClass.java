package nastedLoopPackag;

public class MyClass {
	MyClass(){
		SecondClass a = new SecondClass(this);
	}
	public void myMethod() {
		System.out.println("Outer");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClass();
	}

}
class SecondClass{
	SecondClass(MyClass m){
		m.myMethod();
	}
	void myMethod() {
		System.out.println("Hello");
	}
}
