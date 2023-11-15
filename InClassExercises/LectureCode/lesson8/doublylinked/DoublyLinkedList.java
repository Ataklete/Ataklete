package lesson8.doublylinked;


public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node(null,null, null);
		}
		//adds to the front of the list
		public void addFirst(String item){
			Node n = new Node(header.next, header, item);
			if(header.next != null){
				header.next.previous = n;
			}		
			header.next = n;
			
		}
		
		/** size = the number of non-null nodes */
		int size() {
			if(header.next == null) return 0;
			Node temp = header.next;
			int count = 0;
			while(temp != null) {
				count++;
				temp = temp.next;
			}
			return count;	
		}		
		
		void addLast(String s) {
			Node newNode = new Node(null,null, s);
			//newNode.value = s;
			Node last = header;
			while(last.next != null) {
				last = last.next;
			}
			//now last is the last non-null node
			last.next = newNode;
			newNode.previous = last;
		}

		public void insert(String val, int pos) {
			int size = size();
			if(pos < 0 || pos > size) {
				throw new IllegalArgumentException(
					"Illegal position for new node");
			}
			if(pos == size) addLast(val); //same as add(s);
			else if(pos == 0) addFirst(val);
			else {
				Node n = new Node(null,null, val);
				if (header.next == null) header.next = n;
				else {
					Node temp = header.next;
					int count = 1; 
					while(count < pos) {
						temp = temp.next;
						count++;
					} 
					//insert n between temp and temp.next
					Node last = temp.next;
					temp.next = n;
					last.previous = temp.next;
					n.next = last;  //placing n into position pos
					n.previous = temp;
				}
				
				
				
			}			
			
		}
		
		public String toString() { 
			var sb = new StringBuffer();
			Node next = header.next;
			while(next != null) {
				sb.append(next.toString() + ", ");
				next = next.next;
			}
			var result = sb.toString();
			if(result.charAt(result.length()-1) == ',') {
				return result.substring(0,result.length()-1);
			}
			return result;
			
			
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
			
			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			var list = new DoublyLinkedList();
			list.addFirst("Bob");
			list.addFirst("Harry");
			list.addFirst("Steve");
			System.out.println(list);
		}
}
