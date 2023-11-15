package Selfcheck;

public class StackArray {
	private int[] arr = new int[10];
	private int rear = 0;
	
	boolean isEmpty() {
		return (rear==0);
	}
	int size() {
		return (rear-0);
	}
	void push(int s) {
		if(isEmpty()) {
			arr[rear] = s;
			rear++;
		}
		else {
			arr[rear] = s;
			rear++;
		}
	}
	int pop() {
		if(isEmpty()) {
			throw new NullPointerException("Stack Is Empty !");
		}
		else {
			int s = arr[rear-1];
			arr[rear] = 0;
			rear--;
			return s;
		}
	}
	int peek() {
		if(isEmpty()) {
			return 0;
		}
		else {
			int n = arr[rear-1];
			return n;
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("Empty");
		}
		else {
			for (int i = 0; i < rear; i++) {
				System.out.println( arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		StackArray s = new StackArray();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		try {
		System.out.println("Popped Item Is : " + s.pop());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Pekked Item Is : " + s.peek());
		System.out.println("Size Is: " + s.size());
		s.display();
	}
}

