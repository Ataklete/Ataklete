package prog9_4;

import java.util.Arrays;

public class ArrayQueueImpl  {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	
	
	public int peek() throws QueueException {
		if(isEmpty()) {
			throw new QueueException("queue is empty");	
		}else {
			return arr[front];
		}

	}
	
	public void enqueue(int x){
		if(front == -1) 
			front++;
		if(rear == arr.length) 
			resize();
			arr[rear++] = x;
	}
	
	
	public int dequeue() throws QueueException {
		if(isEmpty())
			throw new QueueException("Queue is empty");
		int x = peek();
		arr[front] = 0;
		front++;
		return x;
		
		//implement
	}
	
	public boolean isEmpty(){	
		//implement
		if(rear == 0 && front == -1) {
			return true;
		}
		
		return false ;
	}
	
	public int size(){	
		//implement
		return rear - front;
	}
	void resize() {
		arr = Arrays.copyOf(arr, arr.length * 2);
	}
	
	
}
