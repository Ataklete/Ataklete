package lesson12.finallyexercise;

import java.io.IOException;

class FinallyTest2 {
	public static void test() throws Exception {
//        try {
//             return;                         // 1
//             System.exit(0);                 // 2
             throw new Exception("first");   // 3a
//        }
//        catch (IOException io){
//	         System.out.println(io.getMessage());
//           throw new IOException("IO");  // 3b (a and b included)
//      }
//        catch (Exception x){
//	         System.out.println(x.getMessage());
//             throw new Exception("second");  // 3b (a and b included)
//        }
//        finally {
//            System.out.println("finally!");
//        }
//        System.out.println("last statement");  // 3b not included
    }

	public static void main(String[] args){
        try{
            test();
        }
        catch(Exception x){
            System.out.println(x.getMessage());
	   }
    }
}
