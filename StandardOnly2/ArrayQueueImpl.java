package StandardOnly2;


public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	int size = 0;
	
	
	 private void resize(){
	        int[] temp = new int[arr.length * 2];
	        for (int i = 0; i < size; i ++){
	            temp[i] = this.arr[i];
	        }

	        this.arr = temp;
	    }
	
	public void enqueue(int obj){
		//implement
		if(isEmpty()) {
			arr[0] = obj;
			front++;
			rear++;
		}
		
		if(rear==arr.length) {
			resize();
		}
		
		
		else {
			arr[rear] = obj;
			rear++;
//			front++;
		}
	}
	
	public int dequeue() throws QueueException{
		if(isEmpty()) {
			throw new QueueException("Queue is Empty");
		}
		else {
			int s = arr[front];
			front++;
		return s;
		//implement
	}
}
	public boolean isEmpty(){	
		return (rear==0);
		
	}
	
	public int size(){	
		//implement
		return (rear-front);
	}
	
	public int peek() throws QueueException{
		if(isEmpty()) {
			throw new QueueException("Queue is Empty");
		}
		return arr[front];
		//implement
	}
	

}
