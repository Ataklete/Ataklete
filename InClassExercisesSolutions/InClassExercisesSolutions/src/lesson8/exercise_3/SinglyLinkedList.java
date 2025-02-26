package lesson8.exercise_3;

public class SinglyLinkedList {
	private Node startNode;
	
	
	void insert(String s, int pos) {
		int size = size();
		if(pos < 0 || pos > size) {
			throw new IllegalArgumentException(
				"Illegal position for new node");
		}
		if(pos == size) addLast(s); 
		else if(pos == 0) addFirst(s);
		else {
			// Create new node N
			Node n = new Node();
			n.data = s;
			//startNode will not be null here
			Node previous = startNode;
			// Locate position to insert 
			for(int i = 0; i < pos - 1; ++i) {
				previous = previous.nextNode;
			}
			
			//insert n just after previous
			n.nextNode = previous.nextNode;
			previous.nextNode = n;
			
			// above is same as this:
//			Node last = previous.nextNode;
//			n.nextNode = last; //placing n into position pos
//			n.nextNode = previous.nextNode;
		}
	}
	
	/** size = the number of non-null nodes */
	int size() {
		if(startNode == null) return 0;
		Node temp = startNode;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.nextNode;
		}
		return count;	
	}
	
	boolean search(String s) {
		if(s == null) return false;
		Node next = startNode;
		while(next != null) {
			String t = next.data;
			if(s.equals(t)) {
				return true;
			}
			next = next.nextNode;
		}
		return false;
	}
	void removeNode(String s) {
		if(s == null) return;
		if(startNode != null && startNode.data.equals(s)){
			startNode = startNode.nextNode;
			return;
		}
		Node previous = startNode;
		Node next = startNode.nextNode;
		while(next != null) {
			if(s.equals(next.data)) {
				previous.nextNode = next.nextNode;
				return;
			}
			previous = next;
			next = next.nextNode;		
		}
	}
	
	void printNodes() {
		System.out.println(startNode.toString());
	}
	
	void addFirst(String s) {
		Node newNode = new Node();
		newNode.data = s;
		newNode.nextNode = startNode;
		startNode = newNode;
	}
	
	void addLast(String s) {
		Node newNode = new Node();
		newNode.data = s;
		//if startNode == null, set startNode to be newNode
		if(startNode == null) {
			startNode = newNode;
		}
		else { //find last non-null node
			Node last = startNode;
			while(last.nextNode != null) {
				last = last.nextNode;
			}
			//now last is the last non-null node
			last.nextNode = newNode;
			
		}		
	}
	
	class Node {
		String data;
		Node nextNode;
		
		@Override
		public String toString() {
		    if(data == null) return "";
			StringBuilder sb = new StringBuilder(data + " ");
			sb = toString(sb, nextNode);
			return sb.toString();
		}
		private StringBuilder toString(StringBuilder sb, Node n) {
			if(n == null) return sb;
			sb.append(n.data + " ");
			return toString(sb, n.nextNode);
		}
	}	
	public static void main(String[] args) {
		
		SinglyLinkedList m = new SinglyLinkedList();
		m.populateNodes();
		boolean foundCharles = m.search("Charles");
		System.out.println("Found Charles? " + foundCharles);
		
		m.printNodes();
		m.addFirst("Frank");
		//m.removeNode("David");
		m.printNodes();
		m.addLast("Ricardo");
		m.printNodes();
		
		//uncomment when ready
		System.out.println(m.size());
		m.insert("Bob", 2);
		m.printNodes();
		m.insert("Jerry", 5);
		m.printNodes();
//		m.insert("Tom", 0);
//		m.printNodes();
//		m.insert("Jarred", 5);
//		m.printNodes();
//		m.removeNode("Tom");
//		m.printNodes();
		
	}
	private void populateNodes() {
		String[] stringData = {"Albert", "Billy", "Charles", "David", "Emma"};
		startNode = new Node();
		startNode.data = stringData[0];
		
		Node next = startNode;
		
		for(int i = 1; i < stringData.length; ++i) {
			next.nextNode = new Node();
			next.nextNode.data = stringData[i];
			next = next.nextNode;
		}
	}
}
