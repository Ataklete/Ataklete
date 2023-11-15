package Selfcheck;

public class StackLinkedList {
	Node head = null;
	public StackLinkedList() {
		head= new Node();
	}
	boolean isEmapty() {
		return (head.next==null);
	}
	void push(String s) {
		Node n = new Node();
		if(isEmapty()) {
			head.next = n;	
		}
		else {
			Node temp = head;
			while(head.next!=null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	String pop() {
		if(isEmapty()) {
			throw new NullPointerException("Empity !");
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			String s = temp.val;
			temp = null;
			return s;
		}
	}
	String peek() {
		if(isEmapty()) {
			throw new NullPointerException("Can't Peek Node Is Empty  !");
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		String s = temp.val;
		return s;
	}
	void display() {
		if(head.next==null) {
			System.out.println("Empty");
		}
		else {
			Node temp= head;
			while(temp.next!= null) {
				System.out.println(temp.val);
				temp =temp.next;
			}
		}
	}
	class Node{
		Node next;
		String val;
		public Node() {
			// TODO Auto-generated constructor stub
		}
	}
	public static void main(String[] args) {
		StackArray st = new StackArray();
		st.push(1);
		st.push(2);
		st.push(3);
		try {
		System.out.println("Popped Item Is:" +  st.pop());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
		System.out.println("Peeked Value Is : " + st.peek());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		st.display();
	}
}
