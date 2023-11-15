package goodpackage4_5;

interface  polygon {
	
public double[] getArrayOfSides();
	
	static double sum(double[] arr) {
		double total = 0;
		for (double a: arr) {
			total += a;
		}
		return total;
	}
	
	default double computePerimeter() {
		return sum(getArrayOfSides());

}
}