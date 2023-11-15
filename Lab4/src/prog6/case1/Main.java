package prog6.case1;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc1 = new GregorianCalendar(1982,12,23); 
		Person p1 = new Person("Aman",gc1);
		
		GregorianCalendar gc2 = new GregorianCalendar(1983,12,23); 
		Person p2 = new Person("Atak",gc2);
		
		GregorianCalendar gc3 = new GregorianCalendar(1983,12,23); 
		Person p3 = new Person("Atak",gc3);
		
		Person p4 = new PersonWithJob("Atak",gc3,110000);
		Person p5 = new PersonWithJob("Atak",gc3,120000);
		
		System.out.println(p1.equals(p2));
		System.out.println(p3.equals(p2));
		System.out.println(p3.equals(p4));
		System.out.println(p5.equals(p4));
	}

}
