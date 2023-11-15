package letterCapitalization;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCapitalization {
	
	
	public static char[] letterCapital(String s) {

		char[] charArray = s.toCharArray();
	    boolean foundSpace = true;

	    for(int i = 0; i < charArray.length; i++) {

	      // if the array element is a letter
	      if(Character.isLetter(charArray[i])) {

	        // check space is present before the letter
	        if(foundSpace) {

	          // change the letter into uppercase
	          charArray[i] = Character.toUpperCase(charArray[i]);
	          foundSpace = false;
	        }
	      }

	      else {
	        // if the new character is not character
	        foundSpace = true;
	      }
	    }
	      return charArray;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(letterCapital(sc.nextLine()));

	}

}
