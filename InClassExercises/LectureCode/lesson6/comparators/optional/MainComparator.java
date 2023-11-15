package lesson6.comparators.optional;

import java.util.Arrays;

import lesson6.comparators.NameComparator;
import lesson6.comparators.Person;
import lesson6.comparators.data.PersonData;

/**
 * This version shows how to use a Comparator
 * using jdk1.7 style (using a separately
 * defined Comparator)
 */
public class MainComparator {
	public static void main(String[] args) {
		Person[] persons = PersonData.personData;
		Arrays.sort(persons, new NameComparator());
		System.out.println(Arrays.toString(persons));
	}
}
