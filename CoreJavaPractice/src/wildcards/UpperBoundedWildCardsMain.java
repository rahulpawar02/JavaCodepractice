package wildcards;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCardsMain {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(10, 20, 30);
		System.out.println("sum is: " + sumOfNumbers(intList));
		
		List<Double> doubleList = Arrays.asList(10.5, 20.5, 30.5);
		System.out.println("sum of double is:" + sumOfNumbers(doubleList));
	}
	
	//List<Number> numList when we pass this then show the error at called method.
	
	public static double sumOfNumbers(List< ? extends Number> numList) {

		double sum = 0.0;
		for (Number num : numList) {
			sum += num.doubleValue();
		}
		return sum;
	}
	
	
	/*
	 * An upper-bounded wildcard in Java (? extends Type) means:
	 * "I can work with any type that is Type or a subclass of Type. But I can only read values from it, not add new ones (except null)."
	 */
}
