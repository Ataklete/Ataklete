package Selfcheck;

public class DoubleLinkedList {
	Node head = null;
	public DoubleLinkedList() {
		head = new Node(null, null, null);
	}

	boolean isEmpty() {
		if(head.next==null) {
			return true;
		}
		else {
			return false;
		}
	}
	void add(String s) {
		Node n = new Node(null, s, null);
		if(isEmpty()){
			head.next = n;
			n.prev = head;
		}
		else {
			Node temp = head.next;
			if(n.val.compareTo(temp.val)<0) {
				n.next = head.next;
				head.next = n;
				n.prev = head;
			}
			else {
				n.next = temp.next;
				temp.next = n;
				n.prev = temp;
			}
		}
	}
	String min() {
		if(isEmpty()) {
			return null;
		}
		else {
			Node temp = head.next;
			String min = temp.val;
			while(temp.next!= null) {
				if(min.compareTo(temp.val)>0) {
					min = temp.val;
				}
				temp = temp.next;
			}
			return min;
		}
	}
	boolean search(String data) throws Exception {
		if(isEmpty()) {
			throw new Exception("There Is No Data To Search !");
		}
		else {
			Node temp = head.next;
			while(temp.next!= null) {
				if(data.equals(temp.val)) {
					System.out.println("Found !");
					return true;
				}
				temp = temp.next;
			}
			System.out.println("Not Found !");
			return false;
		}
	}
	void display() {
		if(isEmpty()) {
			throw new NullPointerException("Node Is Empty ! ");
		}
		else {
			Node temp = head.next;
			while(temp!=null) {
				System.out.println(temp.val);
				temp = temp.next;
			}
		}
	}
	class Node{
		Node next;
		Node prev;
		String val;
		public Node(Node prev, String val, Node next) {
			this.next = next;
			this.prev = prev;
			this.val = val;
		}
	}
	public static void main(String[] args) throws Exception {
		DoubleLinkedList db = new DoubleLinkedList();
		db.add("abc");
		db.add("ab");
		db.add("abcd");
		db.add("a");
		try {
		System.out.println("Search result is :" + db.search("ss"));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Minimum Is; " + db.min());
		try {
			db.display();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
