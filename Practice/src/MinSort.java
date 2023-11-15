
public class MinSort {
	static String l = " ";
	static String r = " ";
	
	static String sort1(String l) {
		
		
    if (l.length() < 2) {
        return l;
    }
  
    int pos = 0;
    char min = l.charAt(0);
    int mid = l.length()/2;
    for(int i = 0; i < l.length(); i++) {
        char c = l.charAt(i);
        if (c < min) {
            min = c;
            pos = i;
        }
    }
    return min + sort1(l.substring(0, pos) + l.substring(pos + 1));
	}
   static String sort2( String r) {
	   if (r.length() < 2) {
	        return r;
	    }
	  
	    int pos = 0;
	    char min = r.charAt(0);
	    int mid = r.length()/2;
	    for(int i = 0; i < r.length(); i++) {
	        char c = r.charAt(i);
	        if (c < min) {
	            min = c;
	            pos = i;
	        }
	    }
	    return min + sort1(r.substring(0, pos) + r.substring(pos + 1));
		}
//	 StringBuffer x = min + ssort(l.substring(0, pos) + l.substring(pos + 1);
//   System.out.printf("%c | %s\n", min, l.substring(0, pos) + l.substring(pos + 1));
//
//    return min + ssort(l.substring(0, pos) + l.substring(pos + 1),r.substring(0, pos) + r.substring(pos + 1));


			    public static void main(String[] args) {  
			    	String lr = "AtakleteHaile";
			    	int k = lr.length()/2;
			    //	s = 
			    	System.arraycopy(lr, 0, l, 0, lr.length()/2);
					System.arraycopy(lr, lr.length()/2+1, r, 0, lr.length()/2);
					String m = l;
					String n = r;
			        System.out.println(sort1(m));
			       // System.out.println(sort2(r));
			    

			    
	}
	}


	
