

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = { 33, 66, 12, 95, 43, 21, 88, 99, 10, 55 };
		  
	    int max = 33;
	    int secondMax = 0;
	    int index =0;
	    for( int i=1; i<arr.length; i++)
	     {
	    	
	       if(arr[i]>max){
	    	   
	    	   secondMax = max;
	            max = arr[i];
	            index=i;
	            System.out.println("first if clouse " +i);
	                 }
	       if(max>arr[i] && arr[i]>secondMax){
			         secondMax = arr[i];
			         index=i;
			         System.out.println("Second if clouse " +i);
             }
	    
	       
	     }
	    
	    System.out.println(secondMax + " in the index of " +index);

	

	//	Option 2
	
	List<Integer> newArr = new ArrayList<>();
	 for (Integer ints : arr) {
		 newArr.add(ints);
	 }
	  List<Integer> a = newArr.stream().distinct().collect(Collectors.toList());
	  Collections.sort(a);
	  System.out.print(a.get(a.size()-2) + " in the index of ");
	  System.out.println(a.size()-2);
}

}
