package prog1;


	public class Circle implements Cal {
		private double radius;
		
		public Circle(double radius) {
			this.radius = radius;
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
		@Override
		public double computeArea() {
			return Math.PI * radius * radius;
		}
	}

