//import linkedList.DoubleLinklist.Node;

public class SinglyLinkedList {
	private Node head;
	
	
	
	public SinglyLinkedList() {
		this.head = new Node(null);
	}
  
	    public void addF(String data) {  
	    	Node n = new Node(data);
	    	if (isEmpty()) {
	    		head.next=n;
	    	}
	    	else {
	    		n.next = head.next;
				head.next = n;
	    	}	    	
	    }
	   public void addL(String last) {
		   Node l = new Node(last);
		   if (head.next==null) {
			   head.next = l;
		   }
		   else {
			   Node temp = head;
		   while(temp.next!=null) {
			  // temp.next = head.next;
			   temp=temp.next;
		   }
		   temp.next = l;
		   }
	   } 	
	   public String remL() {// throws Exception {
		   if (isEmpty())
			   throw new NullPointerException("it is Empty"); 
		
		   Node temp = head.next;
		   Node a = head;
		   while ( temp.next!=null) {
			   a=a.next;
			   temp = temp.next;
		   }
		   String s = temp.data;
		  // temp.data = null;
		 //  temp = null;
		   a.next=null;
		   return s;
	   }
	   public String remF() {
		   Node temp = head.next;
		   if(isEmpty())
			   throw new NullPointerException("it is Empty");
		   Node n = temp.next;
		   head.next = n;
		   String s = temp.data;
		  // temp.data=null;
		   //temp.next=null;
		   return s;
	   }    
	 public  String removeNext() {
			 if(isEmpty()) {
				 return null;
			 }
			 else {
				 Node temp = head.next;
				 Node temp1 = temp.next;
				 temp.next = temp1.next;
				 
				 String s = temp1.data;
				 temp1 = null;
				 return s;
			 }
			 }
	 void add(String val) { // insert String by comparing 
			Node n = new Node(val);
			if(isEmpty()) {
				head.next = n;
			}
			else {
				Node temp = head.next;
				if(n.data.compareTo(temp.data)<0) {
					n.next = head.next;
					head.next = n;
					//n.prev = header; for double
				}
				else {
					n.next = temp.next;
					temp.next = n;
				}
			}
		}
	 String  min() {
		 if(isEmpty()) {
			 return null;
		 }
		 else {
			 Node temp=head.next;
			 String s = temp.data;
			 while(temp.next!=null) {
				 if(s.compareTo(temp.data)>0) {
					s = temp.data; 
				 }
				 temp = temp.next;
			 }
			 return s;
		 }
	 }
 public boolean isEmpty() {
	 if (head.next==null) 
		 return true;
	 else
		 return false;
 }
	

	@Override
	public String toString() {
		String str = "";
		Node p = head;
		while (p != null) {
			str = str + p.data + "->";
			p = p.next;
		}
		return str.toString();
	}


	class Node {
		//Node head;
		Node next;
		String data;
		public Node( String data) {
			
			//this.next = next;
			this.data = data;
		}
		
		}

	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		s.addF("Ati");
	    s.addF("Helen");
		s.addF("Henok");
		s.addL("Aman");
		s.add("Saba");
		s.add("Betty");
		System.out.println(s.min());
		//System.out.println(s.remL());
		//System.out.println(s.remF());
		System.out.println(s.toString());

	}

}
