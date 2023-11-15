package lesson6.comparators;

import java.util.Arrays;
import java.util.Comparator;

import lesson6.comparators.data.PersonData;

public class NameComparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	public static void main(String[] args) {
		Person[] persons = PersonData.personData;
		Arrays.sort(persons, new NameComparator());
		System.out.println(Arrays.toString(persons));
	}
}


