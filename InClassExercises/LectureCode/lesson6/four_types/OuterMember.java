package lesson6.four_types;

public class OuterMember {
	public OuterMember() {
		class StudentGrade {
			private String studentLetterGrade;
			private String studentId;
		
			public String toString() {
				return "Student with ID "+ studentId + " has grade " + studentLetterGrade;
			}
		}
		StudentGrade stGrade = new StudentGrade();
		stGrade.studentLetterGrade = "A";
		stGrade.studentId = "123654";

		System.out.println(stGrade);
	}

	public static void main(String[] args) {
		new OuterMember();
	}

}
