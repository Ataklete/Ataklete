package Selfcheck;

public class LinkedList {
	Node header = null;
	
	public LinkedList() {
		header = new Node(null, null);
	}
	boolean  isEmty() {
		if(header.next==null) {
			return true;
		}
		else {
			return false;
		}
	}
	void add(String val) { // insert String by comparing 
		Node n = new Node(null, val);
		if(isEmty()) {
			header.next = n;
		}
		else {
			Node temp = header.next;
			if(n.value.compareTo(temp.value)<0) {
				n.next = header.next;
				header.next = n;
				//n.prev = header; for double
			}
			else {
				n.next = temp.next;
				temp.next = n;
			}
		}
	}
	void addF(String s) {
		Node n = new Node(null, s);
		if(isEmty()) {
			header.next = n;
		}
		else {
			n.next = header.next;
			header.next = n;
		}
	}
	void addL(String s) {
		Node n = new Node(null, s);
		if(isEmty()) {
			addF(s);
		}
		else {
			Node temp = header;
			while(temp.next!= null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	String remFirst() {
		if(isEmty()) {
			return null;
		}
		else {
			Node temp = header.next;
			header.next = temp.next;
			String s = temp.value;
			//System.out.println("Remove first Item Is : " + s);
			return s;
		}
	}
	 String remLast() {
		 if(isEmty()) {
			 throw new NullPointerException("Empity NOde");
		 }
		 else {
			 Node temp = header;
			 while(temp.next!= null) {
				 temp = temp.next;
			 }
			 String s = temp.value;
			 temp = null;
			 return s;
		 }
	 }
	 String removeNext() {
		 if(isEmty()) {
			 return null;
		 }
		 else {
			 Node temp = header.next;
			 Node temp1 = temp.next;
			 temp.next = temp1.next;
			 
			 String s = temp1.value;
			 temp1 = null;
			 return s;
		 }
		 
	 }
	 String  min() {
		 if(isEmty()) {
			 return null;
		 }
		 else {
			 Node temp=header.next;
			 String s = temp.value;
			 while(temp.next!=null) {
				 if(s.compareTo(temp.value)>0) {
					s = temp.value; 
				 }
				 temp = temp.next;
			 }
			 return s;
		 }
	 }
	void display() {
		if(isEmty()) {
			throw new NullPointerException("Empty Node");
		}
		else {
			Node temp = header.next;
			while(temp!= null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
	}
	class Node{
		Node next;
		String value;
		public Node(Node next, String s) {
			this.next = next;
			this.value = s;
		}
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addF("A");
		list.addF("B");
		list.addF("C");
		list.addL("D");
		list.add("a");
		System.out.println("MIN Is ' " + list.min());
		System.out.println("REemove After First Node " + list.removeNext());
	    System.out.println("Remove  First Item : " + list.remFirst());
		try {
		System.out.println("Remove last Item Is  : " + list.remLast());
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
		list.display();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
