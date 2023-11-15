package Selfcheck;

public class QueueLinkedList {
	Node head = null;
	public QueueLinkedList() {
		head = new Node();
	}
	 boolean isEmpty() {
		 return (head.next==null);
	 }
	 void enqueue(String s) {
		 Node n = new Node();
		 if(isEmpty()) {
			 head.next = n;
		 }
	 }
	 void dequeue() {
		 if(isEmpty()) {
			 
		 }
	 }
	String peek() {
		if(isEmpty()) {
			throw new NullPointerException("Emity!");
		}
		else {
			Node temp = head.next;
			String s = temp.val;
			return s;
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("Empity Node");
		}
		else {
			Node temp =head;
			while(temp.next != null) {
				System.out.println(temp.val);
				temp = temp.next;
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
		QueueArray ql = new QueueArray();
		ql.enqueue(11);
		ql.enqueue(22);
		ql.enqueue(33);
		
		//Exception handling for Peek and Display Method
		try {
		System.out.println("Peeked Item Is: " + ql.peek());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
		ql.display();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
