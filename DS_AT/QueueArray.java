package Selfcheck;

public class QueueArray {
	private int front = -1;
	private int rear= 0;
	private int arr[] = new int[10];
	
	boolean isEmpty() {
		return (rear==0);
	}
	int size() {
		return (rear - front);
	}
	void enqueue(int s) {
		if(isEmpty()) {
			arr[0] = s;
			front++;
			rear++;
		}
		else {
			arr[rear] = s;
			rear++;
		}
	}
	int dequeue() {
		if(isEmpty()) {
			throw new NullPointerException("There Is No Data to Diqueue :");
		}
		else {
			int s = arr[front];
			front++;
			return s;
		}
	}
	int peek() {
		if(isEmpty()) {
			return 0;
		}
		else {
			int s = arr[front];
			return s;
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("There is no Data on Display: ");
		}
		else{
			for (int i = front; i < rear; i++) {
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		QueueArray q = new QueueArray();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		try{
		System.out.println("Deleted Data is : " + q.dequeue());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Peek Data Is :" + q.peek());
		System.out.println("Total data Is: " + q.size());
		q.display();
	}
}
