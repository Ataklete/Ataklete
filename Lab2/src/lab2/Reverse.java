package lab2;

public class Reverse {

	public void reverse(String S) {
		
		  char[] try1 = S.toCharArray();
		  
		  for (int i = try1.length-1; i >= 0; i--) {
			  System.out.print(try1[i]);
			  }
		 
//*********************************************************		
		/*
		 * StringBuilder sb = new StringBuilder(); sb.append(S); 
		 * sb = sb.reverse();
		 * System.out.println(sb);
		 */
		 

	}

	public static void main(String[] args) {

		Reverse r = new Reverse();
		r.reverse("Hello");
	}

}
