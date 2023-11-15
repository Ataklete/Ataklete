package lab2;

import java.util.Scanner;


	import java.util.List;
	import java.util.ArrayList;

	public class Substring{

		public static void main(String[] args) {
			System.out.print("Enter a string: ");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			sc.close();
			int len = str.length();
			List<String> temp = new ArrayList<String>();
			for(int i=len+1; i>0; i--) {
				for(int j=0; j<i; j++){					
					if (!temp.contains(str.substring(j,len-i+j+1))){
						System.out.printf("[%s]", str.substring(j,len-i+j+1));
						System.out.println();
						temp.add(str.substring(j,len-i+j+1));
					}
				}
				System.out.println("Substring");
				
			}
			
		}
		
	}		


