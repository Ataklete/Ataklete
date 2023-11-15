package recurtion;

/*  Adding the x value in to y.
the recursion calling until the x = 0; 
because the x value is always decrement and y value adding the 
x value in it's initial value.
and return the final value in y. */

public class One {
	public int fun1(int x, int y) {
		if (x == 0)
			return y;
		else
			return fun1(x - 1, x + y);
	}
	 

	public static void main(String[] args) {
		One r = new One();
		int x = r.fun1(0, 8);
		System.out.println(x);

	}

}
