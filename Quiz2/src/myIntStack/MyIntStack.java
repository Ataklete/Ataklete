package myIntStack;
import java.util.Arrays;
import java.util.EmptyStackException;
public class MyIntStack {
	//DO NOT MODIFY the declaration or initialization of arr
	private Integer[] arr = new Integer[8];
	private int top=0;
	private int size = 0;
	
	/** Returns true if this stack has no elements */
	public boolean isEmpty() {
		//implement
		return (size==0);
		//return false;
	}
	
	/** Pushes an Integer onto the stack. Null inputs 
	 *  are ignored (if the input is null, the method
	 *  simply returns, without modifying the stack in any way.)
	 * @param 
	 */
	public void push(Integer x) {
		//implement
		if(x==null) return;
			arr[top] = x;
			top++;
			size++;
	//System.out.println(arr[top]);
	}

	/** Removes and returns the top element of the stack if
	 * the stack is not empty. If the stack is empty when
	 * pop is called, it causes a MyStackException to be thrown
	 */
	public Integer pop() throws MyStackException {
		//return 1;
		//implement
		if(isEmpty())// {
		//	return 0;}
		throw new MyStackException("Stack is empty");
		//Integer x = peek();
		//if (x!=null) {
		//arr[top]=null;
		else {
		arr[top] = arr[top-1];
		top--;
		size--;
		}
		return arr[top];
		
	}
	
	/** Returns, but does not remove, the top element of the stack if
	 * the stack is not empty. If the stack is empty when
	 * peek is called, it causes a MyStackException to be thrown
	 */
	public int peek() throws MyStackException {
		//return 1;
		//implement
		if(isEmpty()) {
			//return 0;
			throw new MyStackException("Stack is empty");	
		}else {
			return arr[top];
		}
	}
	
//	@Override
//	public String toString() {
//		if(this.size==0){
//			return null;
//		}
// 
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<this.size; i++){
//			sb.append(this.arr[i] + ", ");
//		}
// 
//		sb.setLength(sb.length()-2);
//		return sb.toString();	
//	}

	
	@Override
	public String toString() {
		return "MyIntStack [arr=" + Arrays.toString(arr) + ", top=" + top + ", size=" + size + "]";
	}

	public static void main(String[] args)throws MyStackException  {
		
		MyIntStack a = new MyIntStack();

		for(int i = 1; i <8 ; i ++)
			a.push(i);
		   // a.push(10);
		for(int i = 1; i < 4; i ++) 
			a.pop();
		
		System.out.println(a.peek());
		System.out.println(a.isEmpty());
		System.out.println(a);
		
	}
}


