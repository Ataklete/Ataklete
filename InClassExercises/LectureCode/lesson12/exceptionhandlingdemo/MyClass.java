package lesson12.exceptionhandlingdemo;

import java.io.IOException;

public class MyClass {
	public void myMethod() throws IOException, MyException {
		//method body not shown here
		int i = 0;
		
		if (i == 1)
			throw new IOException();
		throw new MyException();
	}
}


