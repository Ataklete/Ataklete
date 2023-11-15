package lesson3.callbyvalueorreference;

public class TestCalls {

	public static void main(String[] args) {
		TestCalls t = new TestCalls();
		t.ourTests();
	}
	void ourTests() {
		Employee e = new Employee ("", "", 10000, 1980, 3, 9);
		triple(e);
		System.out.println(e.getSalary());
		testArray();
		
	}
	void triple(Employee z) {
		z.raiseSalary(200);
	}

	void testArray() {
		int[] arr = new int[5];
		modifyArray(arr);		
	}
	void modifyArray(int[] mArr) {
		mArr[0] = 4;
	}

}
