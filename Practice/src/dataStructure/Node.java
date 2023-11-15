package dataStructure;

import java.util.LinkedList;
import java.util.ListIterator;

public class Node {
	/*
	 * String data; Node nextNode; Node startNode = new Node(); startNode.data =
	 * "A";
	 */

	public static void main(String[] args) {
		LinkedList<String> Nodes = new LinkedList<String>();
		addInOrder(Nodes, "Addis Ababa");
		addInOrder(Nodes, "Dire Dawa");
		addInOrder(Nodes, "Nazret");
		addInOrder(Nodes, "Mekelle");
		System.out.println(Nodes);

		/*
		 * Nodes.add("Ati"); Nodes.add("Haile"); Nodes.add("Teffera");
		 * Nodes.add("Hagos"); Nodes.add("Henok");
		 * 
		 * System.out.println(Nodes); Nodes.remove(3); Nodes.add(1,
		 * "myname is Ati Haile"); System.out.println(Nodes.toString());
		 */
		
	}

	private static boolean addInOrder(LinkedList<String> LinkedList, String newCity)
	{
		ListIterator<String> stringListIterator = LinkedList.listIterator();
		while (stringListIterator.hasNext()) {
			int comparsion = stringListIterator.next().compareTo(newCity);

			if (comparsion == 0)
			{
				System.out.println(newCity + "is already included as a destination");
				return false;
			} else if (comparsion > 0) 
			{
				return true;
			} 
		}
		
	
	stringListIterator.add(newCity);
	return true;
	}
}


