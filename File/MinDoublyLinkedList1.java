package quiz2b;

public class MinDoublyLinkedList {

	Node header;

	public MinDoublyLinkedList() {
		header = new Node(null, null,  null);
	}


	public void add(String item) {
		Node n = new Node(null, null, null);
		n.value = item;
		Node temp = header;
		
		if (temp.next != null) {

			if (item.compareTo(temp.next.value) < 1) {
			
				n.next = temp.next;
				n.previous = temp;
				temp.next.previous = n;
				temp.next = n;
			} else {
				
				temp = temp.next;
				n.next = temp.next;
				n.previous=temp;
				if (temp.next != null)
					temp.next.previous = n;
				temp.next=n;

			}
		} else {
			header.next = n;
			n.next = null;
			n.previous = header;
		}

	}
		public String min() {
			Node temp= new Node(null, null, null);
			temp=header;
			String min=temp.next.value;
			while(temp.next!=null) {
					if(min.compareTo(temp.next.value)>1) {
						min= temp.next.value;
					}
				temp=temp.next;
			}
			return min;
		}
		
		public String removeMax() {
			Node temp= new Node(null,null,null);
			temp=header;
			String max=temp.next.value;
			int pos=0;
			int count=0;
			while (temp.next!= null) {
					count++;
					if(max.compareTo(temp.next.value)<1) {
						pos=count;
						max= temp.next.value;
					}
					temp=temp.next;
				}
			temp = header;
		for(int i=1;i<pos;i++) {
			
			temp=temp.next;
		}
		Node toRemove= temp.next;
		temp.next=toRemove.next;
		if(toRemove.next!=null)
			toRemove.next.previous=temp;
			
		return max;
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
		MinDoublyLinkedList list = new MinDoublyLinkedList();
		list.add("bill");
		list.add("tom");
		list.add("mike");
		list.add("anne");
		list.add("chris");
//		list.removeMax();
		System.out.println(list);
		System.out.println("Min String is :" +list.min());
		
		System.out.println(list.removeMax());
		
		System.out.println("after removing max element"+ list);


	}
}
