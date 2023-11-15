package final_exam_practice_problem;

import java.util.Iterator;
import java.util.LinkedList;

public class Prob1_LinkedList {

	LinkedList <String> removeZ (LinkedList <String>  list) {
		//implement
		
		return null;	
	}
	
	public static void main(String[] args) {
		Prob1_LinkedList p1 = new Prob1_LinkedList();
		LinkedList<String> l1 = new LinkedList<String>();
		//"book” -> “Zebra” ->  “apple” -> “Total” -> “AtoZ
		l1.add("book");
		l1.add("Zebra");
		l1.add("apple");
		l1.add("Total");
		l1.add("AtoZ");
		LinkedList<String> l2 = p1.removeZ(l1);
		Iterator it = l2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
