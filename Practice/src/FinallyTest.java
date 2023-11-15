import java.io.IOException;

public class FinallyTest {

	public static void test() throws Exception {
		try {
		throw new Exception("New Exception thrown");
		} 
		catch (Exception x) {
			System.out.println("In catch Block: "+ x.getMessage());
			throw new IOException("IOException thrown");
		} 
		//catch (ArithmeticException x) {
			//System.out.println(x.getMessage());
//			throw new Exception("third");			
		//} 
	finally {
			System.out.println("finally!");
		}
		//System.out.println("last statement");
		//throw new Exception("fourth");
	}

	public static void main(String[] args) {
		try {
			test();
			test();
		} catch (Exception x) {
			System.out.println(x.getMessage());
		}
	}

}
 
/*
 * class FinallyTest { public static void test() throws Exception {
 * 
 * try { throw new Exception("first");
 * 
 * } catch (Exception x) { //System.out.println(x.getMessage()); //throw new
 * Exception("second"); } finally { System.out.println("finally!"); } }
 * 
 * public static void main(String[] args) { try { test(); } catch (Exception x)
 * { System.out.println(x.getMessage()); } } }
 */