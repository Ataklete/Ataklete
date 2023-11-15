package prog9_4;

public class Main {

	public static void main(String[] args) throws QueueException {
		ArrayQueueImpl q = new ArrayQueueImpl();
		NodeQueue n = new NodeQueue();
		//q.peek();
	for(int i = 0; i < 8; i ++) {
		n.enqueue(i);
	}
	//	for(int i = 6; i < 8; i ++) {
	//		n.dequeue();
	//	}
	//	System.out.println(n.size());
		System.out.println(n.peek());
		//System.out.println(n.find(10));
		//System.out.println(n.removeVal(1));
	}

}
