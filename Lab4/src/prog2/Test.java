package prog2;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3, 7),
								 new Circle(3),
								};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.print("Area of "+ cc.getClass().getSimpleName()+ " is  ");
			System.out.println(cc.computeArea());
			
		}
      
    
	}

}