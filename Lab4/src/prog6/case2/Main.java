package prog6.case2;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc1 = new GregorianCalendar(1982,12,23); 
		Person p1 = new Person("Ati",gc1);
		
		GregorianCalendar gc2 = new GregorianCalendar(1983,12,23); 
		Person p2 = new Person("Ati",gc1);
		
		GregorianCalendar gc3 = new GregorianCalendar(1983,12,23); 
		Person p3 = new Person("Ati",gc2);
		
		Person p4 = new PersonWithJob("Ati",gc3,110000);
		Person p5 = new PersonWithJob("Atak",gc2,110000);
		
		System.out.println(p1.equals(p2));
		System.out.println(p3.equals(p2));
		System.out.println(p3.equals(p4));
		System.out.println(p5.equals(p4));
	}

}
