package lab2;
import java.util.Scanner;
public class SquerCode {

	public static void main(String[] args) {
		String str = "Ifmanwasmeanttostayonthegroundgodwouldhavegiveusroots";
			  
		  
		  int row = (int)Math.sqrt(str.length());
		  int column = (int)(Math.sqrt(str.length()-1));
		  
		  
			int count = 0;
			char r[][] = new char[row][column];
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					if (count < str.length()) {
						r[i][j] = str.charAt(count);
						count++;
					}

				}
			}
		
			for (int k = 0; k <row; k++) {
				for (int l = 0; l < column; l++) {

					System.out.print(r[k][l]);
				}
				System.out.println("");
			}
			

			String str1 = "";
			for (int m = 0; m < row; m++) {
				str1 += " ";
				for (int n= 0; n< column; n++) {

					str1 += r[n][m];
				}

			}

			System.out.println(str1);
		}
		 
	}	 
	
	
	

	

