package lab2;
import java.util.Scanner;
public class Prog5 {	  
	    
	    static boolean isPalindrome(String str) 
	    { 
	  
	       
	        int i = 0, j = str.length() - 1; 
	  
	        	        while (i < j) { 
	  
	            // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	  
	            
	            i++; 
	            j--; 
	        } 
	  
	       
	        return true; 
	    } 
	  
	    
	    public static void main(String[] args) 
	    { 
	        
	  Scanner cs = new Scanner(System.in);
	  System.out.println("Enter the word; ");
	  String str = cs.nextLine();
	        if (isPalindrome(str)) 
	            System.out.print("Yes"); 
	        else
	            System.out.print("No"); 
	    } 
	} 


