
public class Application {

	//private static String anotherString;

	//private static String anotherString

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trace trace = null;
		if ( args.length>0) {
			if ( args[0].equalsIgnoreCase( "trace.log")) {
				trace = new FileTrace();
			}else if ( args[0].equalsIgnoreCase("console")) {
				trace = new ConsoleTrace();
			}
		}else {
			System.out.println("please use a vaild argument!!!");
			return;
		}
			trace.debug("this is the first debug message");
			trace.error("this is the first error message");
			trace.setDebug(true);
			trace.debug("this is the second debug message");
			trace.debug("this is the first error message");

	}

}
