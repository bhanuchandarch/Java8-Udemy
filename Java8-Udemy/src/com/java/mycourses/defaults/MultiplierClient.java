package com.java.mycourses.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {
		Multiplier multiplier = new MultiplierImpl();
		List<Integer> integerList = Arrays.asList(1, 3, 5);
		System.out.println("Multiplication Result is: " + multiplier.multiply(integerList));
		System.out.println("Size of the List is: " + multiplier.size(integerList));
		System.out.println(Multiplier.isEmpty(integerList));
	}

}
