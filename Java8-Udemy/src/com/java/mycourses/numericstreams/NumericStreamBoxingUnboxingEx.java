package com.java.mycourses.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingEx {

	private static List<Integer> boxing() {
		// primitive to wrapper
		return IntStream.rangeClosed(1, 10)
						//int
						.boxed()
						//Integer
						.collect(Collectors.toList());
	}
	
	private static int unboxing(List<Integer> integerList) {
		// wrapper to primitive
		return integerList.stream()
				.mapToInt(Integer::intValue)
				.sum();
	}
	
	public static void main(String[] args) {
		System.out.println("Boxing: " + boxing());
		System.out.println("Unboxing: " + unboxing(boxing()));
	}

}
