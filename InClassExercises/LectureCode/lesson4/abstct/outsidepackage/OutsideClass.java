package lesson4.abstct.outsidepackage;

import lesson4.abstct.Subclass;

public class OutsideClass extends Subclass {
	protected int num() {
		return 5;
	}

	public static void main(String[] args) {
		OutsideClass oc = new OutsideClass();
		System.out.println(oc.protectedMethod());

	}

}
