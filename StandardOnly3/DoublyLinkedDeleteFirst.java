package StandardOnly3;



public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}
	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() {
		//implementhead
		if(header.next==null || header.next.next==null) {
			throw new  IllegalStateException("Empty");
		}
		else {
			Node temp = header.next;
			Node temp1 = temp.next;
			String s = temp1.value;
			temp.next = temp1.next;
			return s;
		}
		
	}
	
	public boolean isEmpty() {
		//implement
		return true;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

	}
	
	

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		try {
		String deleted = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(list);

	}
}
