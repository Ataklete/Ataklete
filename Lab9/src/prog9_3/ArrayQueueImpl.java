package prog9_3;

public class ArrayQueueImpl {
	public int[] arr = new int[10];
	private int size = 0;
	private int front = 0;
	private int rear = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return arr[size];
	}
	
	public void resize() {
		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
	
	public void enqueue (int e) {
		if(rear == arr.length) resize();
		arr[rear] = e;
		rear++;
		size++;
	}
	
	public int dequeue () {
		if (isEmpty()) throw new IllegalStateException("Cannot dequeue because Queue is empty!");
		int oldFront = arr[front];
		front++;
		size--;
		return oldFront;
	}
	
	public int peek() {
		if(isEmpty()) throw new IllegalStateException("Cannot peek because Queue is empty!");
		else return arr[front];
	}
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
//		uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}

