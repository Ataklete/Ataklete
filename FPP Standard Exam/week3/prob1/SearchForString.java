package week3.prob1;

import java.util.Arrays;
import java.util.List;

public class SearchForString {
	private List<String> list;
	public SearchForString(List<String> strings) {
		this.list = strings;
		
	}
	public boolean search(String s){
		//implement
		return false;
	}
	private boolean recurSearch(String s, int upper){
		//implement
		return false;
	}
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Billy", "Steve", "Ralph", "Susan");
		SearchForString sfs = new SearchForString(str);
		System.out.println(sfs.search("Billy")); //expect true
		System.out.println(sfs.search("Tom")); //expect false

	}

}
