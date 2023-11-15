package prog9_4;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;
	
	/* stores the element at the end of the queue, if it exists */
	private Node tail;
	
	public void enqueue(int s) {
		Node n = new Node();
		n.data = s;
		
		if(head == null) { //in that case, tail is also null
			head = tail = n;
		} else { //head and tail both non-null
			tail.next = n;
			tail = tail.next;
		}
		System.out.println(tail.data);
	}
	
	public int dequeue() throws QueueException {
		if(isEmpty()) throw new QueueException("Cannot dequeue an empty queue");
		int val = head.data;
		head = head.next;
		return val;
	}
	
	public int peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Cannot peek at an empty queue");
		int val = head.data;
		return val;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	public boolean find (int  x) {
		Node f = head;
		while (f.next!=null) {
			if(f.data==x) return true;
			else
		      f= f.next;
	}
		return false;
	}	
	public Node removeVal(int x) {
		Node curr = head;
		Node del = curr.next;
		while(del!=null) {
			//curr.next = del;
			//del=del.next;
		if (del.data ==x && del.next!=null) {
			
			Node a = del.next;
			curr.next = a;
			//curr.next= del.next;
			//break;
					}
		curr = curr.next;
	}
	return curr;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		return head.toString();
	}
	
}
