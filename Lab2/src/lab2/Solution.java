package lab2;

import java.util.Stack;

public class Solution {
	
	
	    
		public String reverseWords(String s) {
		        
		         
//			  char[] a = s.toCharArray();
//			  int j = 0, k=0;
//			  Stack<Character> b = new Stack();
//			    
//		                            for( k=j; k<=a.length-1; k++){
//		                            	if(a[k] !=' ') {
////		                              System.out.print(a[k]);
//		                            //  for(int m=k; m<=a.length; m++) {		
//		                            		b.add(a[k]);
//		                            	    
//		                            	}
//		                              else {
//		                         
//	                            		k=k+1;
//		                            }
//		                            
//		                            }
//		                        	System.out.println(b);
//			    return s;
			if(s == null || s.length () == 0) 
				return s;
			String first =	""+ s.charAt (0);
			return reverseWords (s.substring (1)) + first;
		            
		        }
		        
		      public static void main(String[] args){
		            Solution a = new Solution();
		            a.reverseWords("Ati Haile");
		        }
		        
		    }



