package lab2;

    import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.LinkedHashSet;
	 import java.util.Arrays;
	
public class Prog6 {   
	
	 public static void main(String[] args) {
	       
		   String[] str = { "horse", "dog", "cat", "horse", "dog","cat","rat" };
		   removeDups(str);
		   String s = "hello";
		   Class c1 = s.getClass();
		   System.out.println(c1);
		   Class c2 = String.class;
		   System.out.println(c1==c2);
		   Class c3 = Class.class;
		   System.out.println(c1==c3);
		   String name = "hello".getClass().getSimpleName();
		   System.out.println(name);
		   String name2 = "hello".getClass().getName();
		   System.out.println(name2);
		   
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

