package stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class Stack{
	
	private Node Top;
	private int length; 
	public Stack() {
		Top = null;
		length = 0;
	}
	
	public void push(String s) {
	//if(Top==null ) return	
		Node newTop = new Node(s);
		newTop.data = s;
		//newTop.setTop(Top);;
		newTop.Top=Top;
		Top = newTop;
		length++;
	}
	
	public String peak()  {
		if (Top!=null ) {
		return Top.data;
		}
		else {
		return null; 
		}
	}
	public boolean isEmpty() {
		return (length==0);
	}
	public String  pop() { // throws EmptyStackException{
		if (isEmpty()) { 
			return null;//throw new EmptyStackException();
			}
	//	if(Top!=null) 
		String s = Top.getData();
		Top = Top.getTop();
		length--;
		return s;
		
		
	}
	public int size() {
		return length;
	}
	public String toString() {
		String str = " ";
		Node n = Top;
		while(n!=null){
			str=str+n.data.toString()+"->";
			n=n.Top;
		}
		return str;
	}
	
	class Node {
		String data;
		Node Top;
		
		  public Node(String data) { 
			  this.data = data;
			 // this.Top = top;
			  }
		 
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public Node getTop() {
			return Top;
		}
		public void setTop(Node top) {
			Top = top;
		}
	
	
	}
	public static void main(String[] args) {
		
		Stack a = new Stack();
		a.push("Ati");
		a.push("Hail");
		a.push("Peter");
		System.out.println(a);
		a.pop();
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.pop();
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.isEmpty();
	}
}
