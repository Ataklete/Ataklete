package lesson6.four_types;

public class AnonymousClassExample {
	interface IGrade {
		void printGradeInfo();
	}
	void printGrade(String sGrade, String sGradeId) {
		(new IGrade() {
			String studentLetterGrade = sGrade;
			String studentId = sGradeId;

			public String toString() {
				return "Student with ID "+ studentId 
						+ " has grade " + studentLetterGrade;				
			}
			public void printGradeInfo() {
				System.out.println(this);
			}
		}).printGradeInfo();
	}

	public static void main(String[] args) {
		new AnonymousClassExample().printGrade("A", "123654");
	}
}
