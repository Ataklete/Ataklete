package lab2;
import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.LinkedHashSet;
	 import java.util.Arrays;
	
public class removeDups{   
	
	 public static void main(String[] args) {
	        
		   String[] str = { "horse", "dog", "cat", "horse", "dog" };
		   removeDups(str);
		  }

		  public static String[] removeDups(String[] myArray) {
		   String arrayString ="";
		   for (int j = 0; j < myArray.length; j++) {
		    if (!arrayString.contains(myArray[j])) {
		     arrayString += myArray[j]+",";
		    }
		   }
		   String[] str = arrayString.split(",");
		   System.out.println(Arrays.toString(str));
		   return str;

		  }
		 }	  
	