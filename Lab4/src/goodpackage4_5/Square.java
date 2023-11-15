package goodpackage4_5;

public final class Square extends ClosedCurve implements polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}

	@Override
	public double[] getArrayOfSides() {
		double[] arrayOfSides = {side};
		return arrayOfSides;
	}
	
	@Override
	public double computePerimeter() {
		return ((4*side));
	}
}
