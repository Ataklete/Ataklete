package lab2;

public class LongestString {
	
		
		int lcs( char[] X, char[] Y, int lenS1, int lenS2 ) { 
		    if (lenS1 == 0 || lenS2 == 0) 
		      return 0; 
		    if (X[lenS1-1] == Y[lenS2-1]) 
		      return 1 + lcs(X, Y, lenS1-1, lenS2-1); 
		    else
		      return max(lcs(X, Y, lenS1, lenS2-1), lcs(X, Y, lenS1-1, lenS2)); 
		  } 
		  
		 
		  int max(int a, int b) 
		  { 
		    return (a > b)? a : b; 
		  } 

		  

	public static void main(String[] args) 
	  { 
		LongestString lcs = new LongestString(); 
	    String s1 = "Michle"; 
	    String s2 = "MichleJackson"; 
	  
	    char[] X=s1.toCharArray(); 
	    char[] Y=s2.toCharArray(); 
	    int len1 = X.length; 
	    int len2 = Y.length; 
	  
	    System.out.println("Longest common string is " + " " + lcs.lcs( X, Y, len1, len2 ) ); 
	  } 
	

}
