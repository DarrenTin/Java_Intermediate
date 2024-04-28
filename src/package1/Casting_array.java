package package1;

import java.util.Arrays;

public class Casting_array {
	
	static void test_int_double() {
		int[] arrayInts = {1, 2, 3, 4, 5};
		double[] arrayDoubles = new double[arrayInts.length];
		for (int i = 0; i < arrayInts.length; i++) {
		    arrayDoubles[i] = (double) arrayInts[i];
		}
		System.out.println(Arrays.toString(arrayDoubles));
	}
	
	static void test_string_to_object() { // cast to general
		String[] arrayStrings = {"Hello", "World"};
		Object[] arrayObjects = arrayStrings;
		System.out.println(Arrays.toString(arrayObjects));
	}
	
	static void test_object_to_int() { // cast to specific
		Object[] arrayObjects = {1, 2, 3, 4, 5};
		Integer[] arrayInts = new Integer[arrayObjects.length];
		for (int i = 0; i < arrayInts.length; i++) {
			arrayInts[i] = (int) arrayObjects[i]; // manual explicit downcast
		}
		System.out.println(Arrays.toString(arrayInts));
	}
}
