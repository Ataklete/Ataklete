package lab2;

public class Anagrams {
     static int c=0;
	public void AnagramsString(String s1, String s2) {
		
			if (s1.length()!= s2.length()) {
				System.out.println("they are not complitly Anagrams"); 
				System.exit(0);
			}
			 int n= s1.compareTo(s2);
			 if (n==0) {
				 System.out.println("they are Anagrams"); 
			 }
			 else
				 System.out.println("not Anagrams");
		/*
		 * else if (n==1) System.out.println("they are not Anagrams"); else if (n==-1)
		 * System.out.println("they are not and lessthan Anagrams");
		 */
	}
			
		/*
		 * else { for (int i=0; i<s1.length(); i++) for (int j=0; j<s2.length();j++)
		 * if(s1.charAt(i)==s2.charAt(j)) c++; } } int n = s1.length(); If (c == n)
		 * return true; else return false;
		 */
			//}
		/*	boolean var =s1.contentEquals(s2);
			if (var){
					return var;
		}
		}
		return false;*/
	
	public static void main(String[] args) {
		Anagrams a = new Anagrams();
		a.AnagramsString("army", "ardy");

	}

}
