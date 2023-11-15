package goodpackage;

public class Rectangle extends ClosedCurve implements polygon {
  double   width, hight;
  
  public Rectangle(double width, double hight) {
	//super();
	this.width = width;
	this.hight = hight;
	
}

public double computeArea() {
	
	return width * hight;
	  
  }

@Override
public int getNumberOfSides() {
	return 4;
}

@Override
public double computePerimeter() {
	return ((2*width)+(2*hight));
}
  
}
