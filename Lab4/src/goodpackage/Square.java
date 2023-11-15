package goodpackage;

//import goodpackage4_5.polygon;

public final class Square extends ClosedCurve implements polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}

	@Override
	public int getNumberOfSides() {
		return 4;
	}
	
	@Override
	public double computePerimeter() {
		return ((4*side));
	}
}
