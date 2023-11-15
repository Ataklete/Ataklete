//package miu.trial;
package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chop {
	static int[][] chop(int[] arrayOfInts){

		List<Integer> currentList = new ArrayList<Integer>();

		List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
		boolean isAscending = true;
		boolean flag = false;
		int len = arrayOfInts.length;

		for (int i = 0; i < len; i++) {
			if (i + 1 < len) {
				if (arrayOfInts[i] > arrayOfInts[i+1]) {
					currentList.add(arrayOfInts[i]);
					isAscending = true;

					if (i != 0 && isAscending && flag) {
						listOfLists.add(currentList);

						currentList = new ArrayList<Integer>();
						currentList.add(arrayOfInts[i]);
						flag = false;
					} 
				} else {
					isAscending = false;
					currentList.add(arrayOfInts[i]);
					
					if (i != 0 && !isAscending && !flag) {
						listOfLists.add(currentList);

						currentList = new ArrayList<Integer>();
						currentList.add(arrayOfInts[i]);
						flag = true;
					} 
				}
			} else {
				currentList.add(arrayOfInts[i]);
				listOfLists.add(currentList);
			}
		}
		int[][] array = new int[listOfLists.size()][];
		
		int index = 0;
		
		for (List<Integer> list : listOfLists) {
			 array[index++] = list.stream().mapToInt(Integer::intValue).toArray();
		}
		return array;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOfInts = {2, -5, -21, 3, 8, 18, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int[][] result = chop(arrayOfInts);
		
		for (int[] row : result)  
            System.out.println(Arrays.toString(row)); 
	}
}