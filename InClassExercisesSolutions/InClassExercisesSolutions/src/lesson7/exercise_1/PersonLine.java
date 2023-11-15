package lesson7.exercise_1;

public class PersonLine {
	private Person[] personLine;
	PersonLine(Person[] persons) {
		personLine = persons;
	}
	/** The number of people in line is 1 + the number
	 *  of people behind the person at head of line
	 *  in position 0 
	 */
	public int howManyInLine() {
		return personLine[0].answerToQuestion() + 1;
	}
}


