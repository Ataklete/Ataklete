package prog8_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

	public class Main {

	public static void main(String[] args) {
	  List<Address> lAddress = new ArrayList<Address>();
	  Address address1 = new Address("Ati", "1000", "Fairfield", "Iowa", "52557");
	  Address address2 = new Address("B", "1000", "Fairfield", "Iowa", "52557");
	  Address address3 = new Address("C", "1000", "Fairfield", "Iowa", "52557");
	  Address address4 = new Address("D", "1000", "Fairfield", "Iowa", "52557");
	  
	  lAddress.add(address1);
	  lAddress.add(address2);
	  lAddress.add(address3);
	  lAddress.add(address4);
	 
	 printAsUpperCase(lAddress);
	  
	// lAddress.forEach(name->System.out.println(name));
	}
	  static void printAsUpperCase(List<Address> lAddress) {
		  Address addressClass = new Address(null, null, null, null, null);
		 
		 // for (Address address : lAddress)
		  lAddress.forEach((address)-> {
			 String output = "";  
		   output = String.format("%s, %n", address.getName());
		   output += String.format("%s %n", address.getStreet());
		   output += String.format("%s, ", address.getCity());   
		   output += String.format("%s", address.getState());
		   output += String.format(" %s %n", address.getZip());
		   
		  System.out.println(addressClass.toUpper(output));
		  
		  
		  });

	  }

}
	
/*	}
	      
	     // Method to convert characters  
	     // of a string to opposite case 
	     static void convertOpposite(StringBuffer str) 
	     { 
	        int ln = str.length(); 
	             
	        // Conversion using predefined methods 
	        for (int i=0; i<ln; i++) 
	        { 
	            Character c = str.charAt(i); 
	            
	            if (Character.isLowerCase(c)) 
	                str.replace(i, i+1, Character.toUpperCase(c)+""); 
				             
	        } 
	     } */
	       
	
	     
	    	
		/*
		 * StringBuffer str = new StringBuffer("sanfkanfdoa76786"); // Calling the
		 * Method convertOpposite(str);
		 * 
		 * System.out.println(str);
		 */
	 
		
		
	