package lab2;

public class Parse {

	public static void main(String[] args) {
		String mystring = Data.records;
		String[] myRow = mystring.split(":");
		
		/*
		 * for(String element: myRow) {
		 *  String[] myRowElements = element.split(",");
		 * System.out.println(myRowElements[0]); }
		 */
		 
		for(int i = 0; i< myRow.length;i++) { 
			// String myRowElements = myRow[i].split(",")[0]; 
			 System.out.println(myRow[i].split(",")[0]);
		}
		
		
	}

}
