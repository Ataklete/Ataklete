package prog1;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	private List<Cal> objects = new ArrayList<Cal>();
	
	//DO NOT MODIFY
	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.populateList();
		System.out.println(dm.computeAverageArea());
	}
	
	//DO NOT MODIFY
	public void populateList() {
		Circle c1 = new Circle(5);
		objects.add(c1);
		Circle c2 = new Circle(3);
		objects.add(c2);
		Rectangle r1 = new Rectangle(2, 5);
		objects.add(r1);
		Rectangle r2 = new Rectangle(3, 11);
		objects.add(r2);
		Circle c3 = new Circle(4);
		objects.add(c3);
		randomShuffle();
	}
	
	//IMPLEMENT
	public double computeAverageArea() {
		double ave =0;
		    for(Cal c: objects) {
		    	System.out.println(c.getClass().getSimpleName());
		    	System.out.println(c.computeArea());
		    	ave+=c.computeArea();
		    }
		    
		return  ave/5;
	}
	
	//DO NOT MODIFY
	private void randomShuffle() {
		int len = objects.size();
		for(int i = 0; i < len-1; ++i) {
			int j = RandomNumbers.getRandomInt(i, len-1);
			swap(i,j);
		
		}
	}

	private void swap(int i, int j) {
		//You may modify the type of temp as necessary
		Cal temp = objects.get(j);
		objects.set(j, objects.get(i));
		objects.set(i, temp);
	}
}
