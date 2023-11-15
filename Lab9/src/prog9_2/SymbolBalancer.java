package prog9_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = "" + (char)0;
	String filename;
	String text;
	char[] left;
	char[] right;
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	boolean symbolsBalanced(String delimiters){
		fillDelimArrays(delimiters);
		return checkDelimiters(delimiters);
		
	}
	boolean checkDelimiters(String delimiters) {
		if (delimiters.length()%2!=0 | delimiters.length()==0)return false;
		Stack<Character> stack1=new Stack<>();
		for(int i=0;i<delimiters.length();i++){
			if (delimiters.charAt(i)=='('||delimiters.charAt(i)=='['||delimiters.charAt(i)=='{'){
				 stack1.push(delimiters.charAt(i));
			}
			else {
				if (delimiters.charAt(i)==')'&&stack1.peek()=='('){stack1.pop();continue;}
				else
					if (delimiters.charAt(i)==']' && stack1.peek()=='[') {stack1.pop();continue;}
					else
						if (delimiters.charAt(i)=='}' && stack1.peek()=='{') {stack1.pop();continue;}    		
			}
		} 
		if (stack1.isEmpty())return false;
		else return true;
	}
	boolean isOpen(char c){
		return (open(c) > -1);
	}
	boolean isClosed(char c){
		return (closed(c) > -1);
	}
	int open(char c){
		for(int i = 0; i < left.length; ++i){
			if(c == left[i]) return i;
		}
		return -1;
	}
	int closed(char c){
		for(int i = 0; i < right.length; ++i){
			if(c == right[i]) return i;
		}
		return -1;
	}
	boolean match(char c, char d){
		if(isOpen(c) && isClosed(d)){
			return (open(c)==closed(d));
		}
		if(isClosed(c) && isOpen(d)){
			return (closed(c) == open(d));
		}
		return false;
	}
	
	void fillDelimArrays(String delims){
		int len = delims.length();
		left = new char[len/2];
		right = new char[len/2];
		for(int i = 0; i < len; ++i){
			if(i % 2 == 0){
				left[i/2]=delims.charAt(i);
			}
			else {
				right[i/2]=delims.charAt(i);
			}
		}
	}
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()"));
	}
	void readFile() {
		try {
			Scanner sc = new Scanner(new File(filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception "+ex.getMessage());
		}
	}
	
}



