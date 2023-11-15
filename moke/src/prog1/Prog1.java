package prog1;

import java.util.ArrayList;
import java.util.Arrays;

public class Prog1 {
	
	public static void main(String[] args) {

		int[] a = { 2, -5, -21, 3, 8, 18, 45, 0, 12, 18, 6, 3, 1, 0, -22,6,8 };
		
		int[][] chopped = chop(a);
				
		for(int[] array : chopped)
		{
			System.out.print(Arrays.toString(array));
		}
	}
	
	public static int[][] chop(int[] a) {
		
		int[][] chops;
		ArrayList<Integer> chopSizes = new ArrayList<>();
		int previousSign = a[1] - a[0] < 0 ? -1 : +1;
		int currentSign;
		int elementsCount = 2;
		
		for(int i = 2; i < a.length; i++)
		{
			currentSign = a[i] - a[i-1] < 0 ? -1 : +1;
			
			if(currentSign == previousSign)
			{
				elementsCount++;
			}
			else
			{
				chopSizes.add(elementsCount);
				previousSign = currentSign;
				elementsCount = 2;
			}
		}	
			
		if(elementsCount != 0)
		{
			chopSizes.add(elementsCount);
		}	
		
		int length;
		int startIndex = 0;
		chops = new int[chopSizes.size()][];
		
		// System.out.println(chopSizes);
		
		for(int i = 0; i < chopSizes.size(); i++)
		{
			length = chopSizes.get(i);
			chops[i] = new int[length];
			System.arraycopy(a, startIndex, chops[i], 0, length);
			startIndex += length - 1;
		}
		
		return chops;
	}
}
