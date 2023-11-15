package onlineBusiness;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 
		List<Int> objects = new ArrayList<Int>();
		Gift s = new Gift("Ati",PackageType.INDIVIDUAL);
		
		Business b = new Business("Merchant","HardPlastic","Holiday",50,1,0.25);
		
		Adult a = new Adult("Reusable","Shopper","Everyday",0.0,0.20,0.0);
		
		Kids k = new Kids("Carton","Micky","Happy",.25,.50,.10);
		
		objects.add(b);
		objects.add(a);
		objects.add(k);
		System.out.println(s+"\n");
		
		for (Int obj: objects) {
			
			System.out.println(obj.getClass().getSimpleName()+":  "+obj.Bag()+"\t"+obj.Box()+"\t"+obj.Wrap()+"\n");
			
		}
		
	}

}
