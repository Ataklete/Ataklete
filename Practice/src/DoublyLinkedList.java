
public class DoublyLinkedList {
	private Node head;
	
	public DoublyLinkedList() {
		
		this.head = new Node(null);
	}
   public boolean isEmpty() {
	   if (head.next==null)
		   return true;
	   else 
		   return false;
   }
    public void add(String data) {
    	Node n = new Node(data);
    	if(isEmpty()) {
    		head.next = n;
    		n.prev = head;    		
    	}
    	else {
    		n.next = head.next;
    		n.prev = head;
    		head.next = n;
    		head.next.prev = n;
    	}
    	//head = head.next;
    }
    public void addL(String data) {
    	Node n = new Node(data);
    	Node temp = head.next;
    	while(temp.next!=null) {
    		//n=n.next;
    		temp=temp.next;
    	}
    	temp.next=n;
    	n.prev=temp;
    }
    public void addMin(String data) {
    	Node n = new Node(data);
    	Node temp = head.next;
    	if ( temp.data.compareTo(n.data)<0) {
    		n.next=temp.next;
    		n.prev = temp;
    		temp.next=n;
    		temp.next.prev = n;
    	}
    	else {
    		n.prev = head;
    		n.next = temp;
    		temp.prev = n;
    		head.next =n;
    	}
    }
    public String min() {
    	Node temp = head.next;
    	String s = temp.data;
    	while(temp.next!=null) {
    	if ( s.compareTo(temp.data)>0) {
    		s=temp.data;
    	}
    	temp=temp.next;
    	}
    	return s;
    }
    public String max() {
    	Node temp = head.next;
    	String s = temp.data;
    	int count=0;
    	int pos=0;
    	while(temp.next!=null) {
    		//count++;
    	if ( s.compareTo(temp.data)<0) {
    		++pos;//=count;
    		s=temp.data;
    	}
    	temp=temp.next;
    	}
    	temp = head;
    	for (int i =0; i<=pos; i++) {
    		temp=temp.next;
    	}
    	Node toRemove = temp.next;
    	if ( toRemove.next!=null) {
    		temp.next=toRemove.next;
    		toRemove.next.prev=temp;
    	}
    	return s;
    }
	public String toString() {
		Node p = head;
		String s = " ";
		while (p.next!=null) {
			s=s+p.next.data+"-> ";
			p=p.next;
		}
		return s.toString();
	}

	class Node{
		String data;
		Node next;
		Node prev;
		public Node(String data) {
			
			this.data = data;
			
		}
		
	}

	public static void main(String[] args) {
		DoublyLinkedList s = new DoublyLinkedList();
		s.add("mike");
		s.add("tom");
		s.add("bille");
		s.addMin("anna");
		s.addMin("chris");
		System.out.println(s);
		System.out.println(s.min());
		System.out.println(s.max());
		System.out.println(s);
		s.addL("Ati");
		System.out.println(s);

	}

}
