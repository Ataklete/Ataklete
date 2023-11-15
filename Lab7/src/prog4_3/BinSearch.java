package prog4_3;

//package prog7_3;

/**
 * 
 * @author 611092
 *
 */

public class BinSearch {

	private int len;

	private boolean search(String s, char c) {
		len = s.length();
		if (len == 0)
			return false;
		char ch = s.charAt(len / 2);
		if (ch == c) {
			return true;
		}else if (c < ch)
		{
			return search(s.substring(0, len / 2), c);			
		}else if (c > ch) {
			return search(s.substring((len / 2) + 1), c);
		}else
		{
			return false;
		}			
	}

	public static void main(String[] args) {
		String str = "abcdefg";
		BinSearch bs = new BinSearch();
		System.out.println(bs.search(str, 'f'));
	}

}
