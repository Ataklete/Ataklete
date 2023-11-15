package goodpackage4_5;

public class Rectangle extends ClosedCurve {
  double   width, hight;
  
  public Rectangle(double width, double hight) {
	//super();
	this.width = width;
	this.hight = hight;
	
}

public double computeArea() {
	
	return width * hight;
	  
  }

	/*
	 * @Override public int getNumberOfSides() { return 4; }
	 */

@Override
public double computePerimeter() {
	return ((2*width)+(2*hight));
}

@Override
public double[] getArrayOfSides() {
	double[] arrayOfSides = {width, width, hight, hight};
	return arrayOfSides;
}


  
}
