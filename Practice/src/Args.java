
public class Args {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * int len = 0; if(args != null) len = args.length; for(int i = 0; i < len; ++i)
	 * { System.out.println("position " + i + ": " + args[i]); } } }
	 */
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("<no input>");
		}
		StringBuilder finalSentence = new StringBuilder();
		int len = args.length;
		for (int i = 0; i <len- 1; ++i) {
			finalSentence.append(args[i]);
			finalSentence.append(" "); // much more efficient
		}
		finalSentence.append(args[len - 1]);
		finalSentence.append(".");
	}
}
