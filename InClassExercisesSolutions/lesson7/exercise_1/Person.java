package lesson7.exercise_1;

public class Person {
	String name;
	Person behind;
	Person(String n) {
		name = n;
	}
	/** The question: How many are behind me? */
	int answerToQuestion() {
		if(behind == null) return 0 ;
		else return behind.answerToQuestion() + 1;
	}
}


