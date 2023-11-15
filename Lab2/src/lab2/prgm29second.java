package lab2;

public class prgm29second {
	public static void main(String[] args) {
		String s = "Ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots";
		int rows = 7;
		int column = 8;
		int k = 0;
		char r[][] = new char[rows][column];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 8; j++) {
				if (k < s.length()) {
					r[i][j] = s.charAt(k);
					k++;
				}

			}
		}
		System.out.println("Given string format is:");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 8; j++) {

				System.out.print(r[i][j]);
			}
			System.out.println("");
		}
		System.out.println("Final result format");

		String temp = "";
		for (int i = 0; i < 8; i++) {
			temp += " ";
			for (int j = 0; j < 7; j++) {

				temp += r[j][i];
			}

		}

		System.out.println(temp);
	}

}
