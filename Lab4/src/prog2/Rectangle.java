package prog2;

public class Rectangle extends ClosedCurve {
  private double   width, hight;
  
  public Rectangle(double width, double hight) {
	//super();
	this.width = width;
	this.hight = hight;
	
}

public double computeArea() {
	
	return width * hight;
	  
  }
  
}
