package prog8_2;
public class MyStringLinkedList {
	Node header;
	static int size;
	MyStringLinkedList(){
		header = new Node(null,null, null);
		size = 0;
	}
	public void addFirst(String item){
		Node n = new Node(header.next,header,item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
		size++;
	}
	void printNodes() {
		Node next = header.next;
		if(next == null) System.out.println("");
		else {
			String s= next.toString();
			System.out.println(s);
		}
	}
	void insert(String data, int pos) {
		if(header.next == null) return;
		Node current = header.next;
		for(int i = 0; i < pos; i++) {
			current = current.next;
		}
		Node insertNode = new Node(current, current.previous, data);
		current.previous.next = insertNode;
		current.previous = insertNode;
		size++;
	}
	boolean remove(String data) {
		if(header.next == null) return false;
		Node temp = header.next;
		while(temp.next != null) {
			if(temp.value.equals(data)) {
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				size--;
				return true;
			}
			temp = temp.next;
			if(temp.next == null) {
				if(temp.value.equals(data)) {
					temp.previous.next = null;
					size--;
					return true;
				}
			}
		}
		return false;
	}
	boolean recurSearch(String data) {
		header = header.next;
		if(header == null) return false;
		if(header.value == data) return true;
		header.value = data;
		return recurSearch(header.value);
	}
	Node minNode(Node n) {
		if(header.next == null) return null;
		Node current = header.next;
		n = current;
		while(current.next != null) {
			if(n.value.compareTo(current.next.value)>0) {
				n = current.next;
			}
			current = current.next;
		}
		return n;
	}
	class Node {
		String value;
		Node next;
		Node previous;
		Node(Node next, Node previous, String value){
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
			
		@Override
		public String toString() {
		    if(value == null) return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}
		private StringBuilder toString(StringBuilder sb, Node n) {
			if(n == null) return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}		
	}
	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.addFirst("miniscule");
		list.addFirst("vast");
		list.addFirst("none");
		list.addFirst("numberless");
		list.addFirst("lilliputian");
		list.addFirst("gargantuan");
		list.addFirst("tiny");
		list.addFirst("enormous");
		list.addFirst("square");
		list.addFirst("round");
		list.addFirst("short");
		list.addFirst("tall");
		list.addFirst("small");
		list.addFirst("big");
		list.addFirst("Ati");
		list.printNodes();
		list.insert("long", 7);
		list.printNodes();
		list.remove("enormous");
		list.printNodes();
		System.out.println(list.recurSearch("square"));
		System.out.println(list.minNode(null).toString());
		System.out.println(size);
		
		 
	}
}
