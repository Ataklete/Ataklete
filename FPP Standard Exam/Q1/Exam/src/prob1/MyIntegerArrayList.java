package prob1;

public class MyIntegerArrayList  {
	private Integer[] theArray;
	private int size;

	public MyIntegerArrayList(Integer[] arr) {
		//Data validation -- do not modify!
		if(arr == null) throw new IllegalArgumentException("Null input");
		if(containsNulls(arr)) throw new IllegalArgumentException("Null values in input");
		theArray = arr;
		size = arr.length;
	}

	//Implement
	public Integer remove(int i) {
		return null;
	}

	private boolean containsNulls(Object[] arr){
		for(Object o: arr) {
			if(o == null) return true;
		}
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(theArray[i] + ", ");
		}
		if(size == 0) sb.append("]");
		else {
			sb.append(theArray[size - 1] + "]");
		}
		return sb.toString();
	}

	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		Integer[] testData1 = {3,5,4};
		MyIntegerArrayList list = new MyIntegerArrayList(testData1);
		System.out.println(list); //expected:  [3, 5, 4]
		System.out.println(list.remove(1)); //expected: 5
		System.out.println(list.containsNulls(list.theArray)); //expected: false
		System.out.println(list.size());  //expected: 2
		System.out.println(list); //expected: [3, 4]
		System.out.println(list.remove(1));  //expected: 4
		System.out.println(list); //expected: [3]
		try {
			System.out.println(list.remove(1)); //expected: no output here
		} catch(Exception e) {
			System.out.println(e.getClass().getSimpleName()); //expected: IndexOutOfBoundsException
		}
		System.out.println("\n==========\n");
		
		Integer[] testData2 = {3,4};
		list = new MyIntegerArrayList(testData2);
		System.out.println(list);   //expected:  [3, 4]
		list.remove(0);
		System.out.println(list); //expected: [4]
		list.remove(0);
		System.out.println(list); //expected: []
		try {
			System.out.println(list.remove(0)); //expected: no output here
		} catch(Exception e) {
			System.out.println(e.getClass().getSimpleName()); //expected: IndexOutOfBoundsException
		}	
	}
}