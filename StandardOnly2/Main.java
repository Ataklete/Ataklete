package StandardOnly2;

public class Main {

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		try {
		System.out.println(q.peek());
		}
		catch(QueueException e) {
			System.out.println(e.getMessage());
		}
		
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		try {
		for(int i = 0; i < 14; i ++) {
			q.dequeue();
		}
		}
		catch(QueueException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Size : " + q.size());

	}

}
