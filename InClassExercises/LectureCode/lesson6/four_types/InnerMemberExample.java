package lesson6.four_types;

public class InnerMemberExample {
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
		stGrade.studentLetterGrade = "A";
		stGrade.studentId = "123654";
	}
	void printGrade() {
		System.out.println(stGrade);
	}

	public static void main(String[] args) {
		new InnerMemberExample().printGrade();
	}
}
