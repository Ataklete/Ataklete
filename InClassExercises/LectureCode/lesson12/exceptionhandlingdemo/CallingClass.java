package lesson12.exceptionhandlingdemo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class CallingClass {
	private static final Logger LOG 
	  = Logger.getLogger(
		   CallingClass.class.getPackage().toString());
	MyClass m = new MyClass();
	
	public void callingMethod() {
		try {
			m.myMethod();
			
		} catch(IOException e) {
			LOG.warning("IO");
			displayMessage("Cannot read file.");
		}
		atch(MyException e) {
			LOG.warning("IO");
			displayMessage("Cannot cast class.");
		}
	}
	private static void displayMessage(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		/*
		try {
			FileHandler fh = new 
					FileHandler("C:\\CallingclassLogFile.log");   
			LOG.addHandler(fh);			
		} catch (IOException io) {
			displayMessage("Cannot create log file");
			System.exit(1);
		}
		*/
		CallingClass cc = new CallingClass();
		cc.callingMethod();
		
	}
}




