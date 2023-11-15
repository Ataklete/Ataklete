package lab2;

public class Prog7 {

	public static void main(String[] args) {
			for (int j = 0; j < 2; j++) {
				String output = "";
				output = String.format("%16d %12d %12d %12d %n %n", Prog2.getRandomInt(1, 99), Prog2.getRandomInt(1, 99), Prog2.getRandomInt(1, 99), Prog2.getRandomInt(1, 99));
				output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n", "+", Prog2.getRandomInt(1, 99), "+",Prog2.getRandomInt(1, 99), "+",Prog2.getRandomInt(1, 99), "+",Prog2.getRandomInt(1, 99));
				output += String.format("%16s %12s %12s %12s", "____", "____", "____", "____");
				output += String.format("%n %n");
				System.out.println(output);
			}
	}
}
