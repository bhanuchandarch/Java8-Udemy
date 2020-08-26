package com.java.mycourses.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	private static int sumOfIntegers(List<Integer> integerList) {
		return integerList.stream()
					.reduce(Integer::sum).get();
	}
	
	private static int sumOfIntegersIntStream() {
		return IntStream.rangeClosed(1, 6)
				.sum();
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("Sum of IntegerList is: " + sumOfIntegers(integerList));
		System.out.println("Sum of IntegerList for Intstream is: " + sumOfIntegersIntStream());
	}

}
