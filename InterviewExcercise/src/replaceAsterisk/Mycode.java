package replaceAsterisk;

public class Mycode {
	
	public static String replaceWithAsterisk(String password) {
		char[] a = password.toCharArray();
		String str = "";
		
		if (password == null) {
			str = " ";
		     }
		else if(a.length!=0) {
		for ( int i =0; i<=a.length; i++) {
//				str += "*";
		  }
		}
	    return str;
	    

	  }

	public static void main(String[] args) {
			

		    System.out.println(replaceWithAsterisk(""));

		    System.out.println(replaceWithAsterisk("hello"));

		    System.out.println(replaceWithAsterisk("To*day!"));

		  }

		}

		 
