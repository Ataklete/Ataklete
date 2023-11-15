package prog1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SearchForString {
	private List<String> list;
	public SearchForString(List<String> strings) {
		this.list = strings;
		
		
	}
	

    
    public boolean search(String s) {
        // implement
        if (s == null)
            return false;
        if (list == null || list.size() == 0)
            return false;
        if (list.size() == 1)
            return s.equals(list.get(0));
        if (list.size() == 2)
            return (s.equals(list.get(0)) || s.equals(list.get(1)));
        return recurSearch(s, 0);
    }


    private boolean recurSearch(String s, int indexFromEitherEnd) {
        int front = indexFromEitherEnd;
        int rear = list.size() - 1 - indexFromEitherEnd;
        //if list contains even number of items, this is how recursion ends
        if ( rear == front+1 ) {
            return (s.equals(list.get(front)) || s.equals(list.get(rear)));
        }
        //if list contains odd number of items
        if (front != rear) {
            if (s.equals(list.get(front)) || s.equals(list.get(rear)))
                return true;
            else {
                return recurSearch(s, indexFromEitherEnd + 1);
            }
        } else {
            return s.equals(list.get(indexFromEitherEnd));
        } 
    }



	/* Soluton two*/	
	
			
//		 i=list.size()-1-upper;
//        if(upper<i) {
//        	return false;
//        }
//        else if(list.get(upper).equals(s) || list.get(i).equals(s))
//			return true;
//        else return recurSearch(s, --upper);
		//}
//	}
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Billy", "Steve","Ralph", "Susan", "Ati");
		SearchForString sfs = new SearchForString(str);
		System.out.println(sfs.search("Billy")); //expect true
		System.out.println(sfs.search("Tom")); //expect false
		

	}

}
