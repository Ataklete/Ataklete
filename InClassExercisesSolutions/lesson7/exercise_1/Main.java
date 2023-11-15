package lesson7.exercise_1;

public class Main {
	public static void main(String[] args) {
		PersonLine personLine = createPersonLine(16);
		System.out.println(personLine.howManyInLine());		
	}
	
	static PersonLine createPersonLine(int num) {
		Person[] persons = new Person[num];
		for(int i = 0 ; i < num; ++i) {	
			persons[i] = new Person("" + ('A' + i));
			if(i > 0) persons[i-1].behind = persons[i];
		}
		return new PersonLine(persons);
	}
}

