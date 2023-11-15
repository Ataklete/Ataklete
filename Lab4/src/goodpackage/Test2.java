package goodpackage;


public class Test2 {
	
	
		public static void main(String[] args) {

			polygon[] objects = {new Triangle(4,5,6),
									 new Square(3),
									 new Rectangle(3,4)};
			//compute areas
			for(polygon pn : objects) {
				
				System.out.println("For this " + pn.getClass().getSimpleName());
				System.out.println("\tNumber of sides = " + pn.getNumberOfSides());
				System.out.println("\tPerimeter = " + pn.computePerimeter());
				
			}
	}

}