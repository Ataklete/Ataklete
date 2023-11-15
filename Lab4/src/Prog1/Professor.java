package Prog1;

 public class Professor extends DeptEmployee {
	 
 
	 
	 public Professor(String name, double salarly, int y, int m, int d) {
		super(name, salarly, y, m, d);
		
	}
	
		int numberOfPublications;

		public int getNumberOfPublications() {
			return numberOfPublications;
		}
		public void setNumberOfPublications(int numberOfPublications) {
			this.numberOfPublications = numberOfPublications;
	 
	 
		}
}
