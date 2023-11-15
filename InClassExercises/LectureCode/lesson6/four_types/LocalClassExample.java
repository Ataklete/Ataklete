package lesson6.four_types;

public class LocalClassExample {
	void printGrade(String sGrade, String sGradeId) {
		class StudentGrade {
			String studentLetterGrade;
			String studentId;
		
			public String toString() {
				return "Student with ID "+ studentId 
						+ " has grade " + studentLetterGrade;
			}
		}
		StudentGrade stGrade = new StudentGrade();
		{
			stGrade.studentLetterGrade = sGrade;
			stGrade.studentId = sGradeId;
		}
		System.out.println(stGrade);
	}

	public static void main(String[] args) {
		new LocalClassExample().printGrade("A", "123654");	
	}
}
