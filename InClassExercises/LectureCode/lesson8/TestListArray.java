package lesson8;

import java.util.ArrayList;
import java.util.List;

public class TestListArray {

	public TestListArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
//		ArrayList<String>[] arrayOfLists = new ArrayList<String>[10];
		ArrayList<List<String>> listOfLists = 
				new ArrayList<List<String>>(10);

		Object[] oArr = new Object[10];
		for(Object o : oArr) {
			o = new ArrayList<String>();
			ArrayList<String> aL = (ArrayList<String>)o;
			aL.add("TestIt");
			System.out.println(aL.get(0));
		}
		
	}

}
