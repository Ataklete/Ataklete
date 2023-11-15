package prog1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MockProg1 {
	static int count = 0;


	public static void main(String[] args) {

		int[] a = { 2, -5, -21, 3, 8, 18, 45, 0, 12, 18, 6, 3, 1, 0, -22 };
		System.out.println(chop(a));
	}

	public static ArrayList<ArrayList<Integer>> chop(int[] a) {
		if(a!=null && a.length<2)
			return null;
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(a[0]);
		temp.add(a[1]);
		boolean ace = false;
		if (a[0] <= a[1])
			ace = true;
		for (int i = 2; i < a.length; i++) {
			if (ace) { // ascending check
				if (a[i-1] <= a[i]) {
					temp.add(a[i]);
				} else {
					ret.add((ArrayList<Integer>)temp.clone());
					temp.clear();
					temp.add(a[i-1]);
					temp.add(a[i]);
					ace = false;
				}
			} else { // descending check
				if (a[i-1] >= a[i]) {
					temp.add(a[i]);
				} else {
					ret.add((ArrayList<Integer>)temp.clone());
					temp.clear();
					temp.add(a[i-1]);
					temp.add(a[i]);
					ace = true;
				}
			}
		}
	//	if(!temp.isEmpty())
		//	ret.add(temp);
		return ret;
	}
}
