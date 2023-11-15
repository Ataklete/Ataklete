package prog4_1;
/**
 * 
 * @author 611092
 *
 */
public class Exponential {
	public double power(double x, int n) {
		if(n == 1) {
			return x;
		}
		return x * power(x,n-1);
	}

	public static void main(String[] args) {
		Exponential e = new Exponential();
		System.out.println(e.power(2, 10));
		//System.out.println(e.power(2, 6));
	}
}
