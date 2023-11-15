package lesson7.exercise_1;

import java.util.Arrays;

public class ArrayProduct {

	public ArrayProduct() {
		
	}

	double calcProduct1(int[] arrayOfNums) {
		if (arrayOfNums.length == 0)
			return 1;
		int lastIdx = arrayOfNums.length-1;
		return (arrayOfNums[lastIdx] * calcProduct1(Arrays.copyOf(arrayOfNums, lastIdx))); 
	}
	
	double calcProduct2(int[] arrayOfNums) {
		if (arrayOfNums.length == 0)
			return 1;
		if (arrayOfNums.length == 1)
			return arrayOfNums[0];
		int [] newArray = Arrays.copyOfRange(arrayOfNums, 1, arrayOfNums.length);
		return (arrayOfNums[0] * calcProduct2(Arrays.copyOfRange(arrayOfNums, 1, arrayOfNums.length))); 
	}
	
	double calcProduct3(int[] arrayOfNums, int lastIdx) {
		if (lastIdx < 0)
			return 1;
		return (arrayOfNums[lastIdx] * calcProduct3(arrayOfNums, --lastIdx)); 
	}
	
	public static void main(String[] args) {
		int[] arrayOfNumbers = {5,2,8,1,6};
		ArrayProduct aProduct = new ArrayProduct();
		System.out.println("Product of arrays (#1) is: "+aProduct.calcProduct1(arrayOfNumbers));
		System.out.println("Product of arrays (#2) is: "+aProduct.calcProduct2(arrayOfNumbers));
		System.out.println("Product of arrays (#3) is: "+aProduct.calcProduct3(arrayOfNumbers, (arrayOfNumbers.length-1)));

	}
}
