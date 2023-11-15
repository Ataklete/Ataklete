package minDubelyLinkedList;

public class DoublinkList {

	private Node header;

	public DoublinkList() {
	   header = new Node(null,null,null);
	}

	public void add(String item) {
		// implement
		Node current = header;
		Node n = new Node(null,null,null);
		n.value = item;

		String nextNodeValue = "";
		if (current.next != null) {
			nextNodeValue = current.next.value;

			if (item.compareTo(nextNodeValue)<1) {
				n.previous = current;
				n.next = current.next;
					current.next.previous = n;
				current.next = n;
			} else {
				current = current.next;
				n.previous = current;
				n.next = current.next;
				if (current.next != null)
					current.next.previous = n;
				current.next = n;
			}
		} else {
			n.previous = current;
			n.next = current.next; //current.next is null & n.next is null also
			current.next = n;
		}

	}
    public String remove() {
    	String s = header.next.value;
    	return s;
    }
    public String max() {
    	Node m = header;
    	if (header==null || header.next == null) {
    		header =null;
    	   return m.value;
    }
    while (m.next!=null){
    	  	m=m.next;
    }
    return m.value;
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

		public Node(String value, Node next, Node previous) {
			this.value = value;
			this.next = next;
			this.previous = previous;
		}

	}
	public static void main(String[] args) {
		DoublinkList list = new DoublinkList();
		
      
		list.add("tom");
		System.out.println(list);
		list.add("mike");
    	System.out.println(list);
    	list.add("bill");
    	System.out.println(list);
		list.add("anne");
		System.out.println(list);
		list.add("chris");
		System.out.println(list);
		
		System.out.println(list.remove());
		System.out.println(list.max());
		//System.out.println(list.removeMax());
	
	}
}
