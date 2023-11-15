package queue;

//import java.util.QueueException;

public class Queue {
	// private String data;
	private Node head;
	private Node tail;
	
	public Queue() {
		head = null;
		tail = null;
	}

	public void enqueue(String s) {
		Node n = new Node();
		n.data = s;

		if (head == null) { // in that case, tail is also null
			head = tail = n;
		} else { // head and tail both non-null
			tail.next = n;
			tail = tail.next;
		}
	}
	public void dequeue() {
		head = head.next;
		//head.next = ;
	}
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("empty");
		String val = head.data;
		head=head.next;
		return val;
	}
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		String str = " ";
		Node n = head;
		while (n != null) {
			str = str + n.data + "->";
			n = n.next;
		}
		return str.toString();
	}

	
	class Node {
		private String data;
		private Node next;
		// private Node rear;

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}
		
	}

	public static void main(String[] args) throws queue.QueueException {
		Queue a = new Queue();
		a.enqueue("Ati");
		a.enqueue("Josi");
		a.enqueue("Saba");
		System.out.println(a);
		a.dequeue();
		System.out.println(a);
		a.enqueue("betty");
		a.enqueue("routh");
		System.out.println(a);
		a.dequeue();
		System.out.println(a.peek());
		System.out.println(a);
		a.enqueue("liya");
		System.out.println(a);
		System.out.println(a.isEmpty());

	}

}
