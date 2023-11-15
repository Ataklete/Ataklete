package prog9_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancerMin {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	char[] left;
	char[] right;
	public SymbolBalancerMin(String filename) {
		this.filename = filename;
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	boolean symbolsBalanced(String delimiters){
		LinkedList<Character> stack = new LinkedList<Character>();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(' || text.charAt(i) == '[' || text.charAt(i) == '{' || text.charAt(i) == '<') {
				stack.push(text.charAt(i));
			}
			if (text.charAt(i) == ')') {
				if (stack.pop() != '(') {
					System.out.println("There is parenthesis mismatch for: " + text.charAt(i));
					System.out.println("A" + stack.toString());
					return false;
				}
			}
			if (text.charAt(i) == ']') {
				if (stack.pop() != '[') {
					System.out.println("There is square brackets mismatch for: " + text.charAt(i));
					return false;
				}
			}
			if (text.charAt(i) == '}') {
				if (stack.pop() != '{') {
					System.out.println("There is curly brackets mismatch for: " + stack.peek());
					return false;
				}
			}
			if (text.charAt(i) == '>') {
				if (stack.pop() != '<') {
					System.out.println("There is angle brackets mismatch for: " + text.charAt(i));
					return false;
				}
			}
		}
		return stack.isEmpty() ? true : false;
		
	}
	
	public static void main(String[] args) {
		SymbolBalancerMin sb = new SymbolBalancerMin("Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}()"));
	}
	void readFile() {
		String prefix = System.getProperty("user.dir") + "\\";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}
	
}



