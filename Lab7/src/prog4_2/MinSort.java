package prog4_2;
/**
 * 
 * @author 611092
 *
 */
public class MinSort {
	String sort(String s) {
		// if s is null or empty
		if(s == null || s.length() == 0) {
			return "";
		}		
		
		// Creating array of string length 
        char[] charArray = new char[s.length()]; 
  
        // Copy character by character into array 
        charArray = s.toCharArray();
        
        // finding the index of minimum character
        int minpos = s.indexOf(rmin(s));
        // Swapping
        char temp;
		temp = charArray[0];
		charArray[0] = charArray[minpos];
		charArray[minpos] = temp;
		
		String sw = new String(charArray);
		String t = sw.substring(1);		
		return ""+ charArray[0] + sort(t);	
		
	}
	
	// the minimum character finder
	private Character rmin(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		char ch = str.charAt(0);
		if (str.length() == 1)
			return ch;
		char prevMin = rmin(str.substring(1));
		return (ch < prevMin ? ch : prevMin);
	}
	
	public static void main(String[] args) {
		String s = "zwxuabfkafutbbbb";
		MinSort ms = new MinSort();
		System.out.println(ms.sort(s));		
	}
}

