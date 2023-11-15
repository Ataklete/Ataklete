package quiz3a;

import java.util.Arrays;
import java.util.List;

public class SearchForString {
	private List<String> list;

	public SearchForString(List<String> strings) {
		this.list = strings;

	}

	public boolean search(String s) {
		return recurSearch(s, list.size() - 1);
		
	}

	private boolean recurSearch(String s, int upper) {
		int lower = list.size() - upper - 1;

		if (upper < lower) {
			return false;
		} else if (list.get(upper).equals(s) || list.get(lower).equals(s)) {
			return true;
		} else {
			return recurSearch(s, --upper);
		}
//		if(upper==-1) return false;
//		else if(list.get(upper).equals(s))
//			return true;
//		
//		else return recurSearch(s, upper-1);
	}

	public static void main(String[] args) {
		List<String> str = Arrays.asList("Billy", "Steve", "Ram", "Susan", "harry");
		SearchForString sfs = new SearchForString(str);
		System.out.println(sfs.search("Billy")); // expect true
		System.out.println(sfs.search("Tom")); // expect false

	}

}
