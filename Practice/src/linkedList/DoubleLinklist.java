package linkedList;



public class DoubleLinklist {
	private Node header;
	static int size;

	public DoubleLinklist() {
		header = new Node(null, null, null);
		size = 0;
	}

	public void addfirst(String item) {
		 Node current = header;
		Node n = new Node(item,header.next, header);
		//if (header.next != null) {
			n.prev = current;
			current.next = n;
		size++;
		/*
		 * // Node current = header; Node n = new Node(item,header.next,header);
		 * //n.data = item;
		 * 
		 * 
		 * String nextNodeValue = ""; if (current.next != null) { nextNodeValue =
		 * current.next.data;
		 * 
		 * if (item.compareTo(nextNodeValue)<1) {
		 * 
		 * if(header.next == null) { header.next = n; n.prev = header; n.next =
		 * header.next; header.next.prev = n;
		 * 
		 * }
		 */
	}

	public void addLast(String j) {
		Node p = header;
		Node newNode = new Node(j, header.next, header);
		
		while (header.next != null) {
			header= header.next;
			if (header.next == null) {
			header.next = newNode;
			header.next.prev = header;
		
			}
		}
	}
	/*
	 * else { n.prev = header; n.next = header.next; current.next.prev = n;
	 * header.next = n;} //}
	 */ /*
		 * else { current = current.next; n.prev = current; n.next = current.next; if
		 * (current.next != null) current.next.prev = n; current.next = n; }
		 */
	/*
	 * } else{ if n.prev = current; n.next = current.next; //current.next is null &
	 * n.next is null also current.next = n; }
	 */

	@Override
	public String toString() {
		String str = "";
		Node p = header;
		while (p != null) {
			str = str + p.data + "->";
			p = p.next;
		}
		return str.toString();
	}

	public class Node {
		private String data;
		private Node prev;
		private Node next;

		/*
		 * public String toString() { return data == null ? "null" : data; }
		 */

		public Node(String data, Node next, Node prev) {
			super();
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		/*
		 * public String toString() { return data == null ? "null" : data; }
		 */
	}

	public static void main(String[] args) {
		DoubleLinklist a = new DoubleLinklist();
		a.addfirst("Ati");
		a.addfirst("Saba");
		a.addfirst("Hellen");
		a.addfirst("Henok");
		a.addfirst("josi");
	   // a.addLast("Liya");
		System.out.println(a);
	}

}
