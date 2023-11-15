package nastedLoopPackag;

public class Exponent {
	public double exponent(double x, double n) {
		double b=0;
		if (n==0) {	
			return x;
			
		}
	
		    return b = x*exponent(x,n-1);
		    
		}


	public static void main(String[] args) {
		Exponent c = new Exponent();
		
		System.out.println(c.exponent(2,10));
	}

}
