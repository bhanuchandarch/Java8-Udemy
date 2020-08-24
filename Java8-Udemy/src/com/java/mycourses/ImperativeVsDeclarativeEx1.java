package com.java.mycourses;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeEx1 {

	public static void main(String[] args) {
		// Sum of Integers 0-100
		
		/**
		 * Imperative - How Style of Programming
		 */
		
		int imperativeSum = 0;
		
		for (int i = 0; i <= 100; i++) {
			imperativeSum += i;
		}
		
		System.out.println("Sum using Imperative approach: " + imperativeSum);
		
		/**
		 * Declarative - What Style of Programming
		 */
		
		int declarativeSum = IntStream.rangeClosed(0, 100)
				.parallel()
				.sum();
		System.out.println("Sum using declarative approach: " + declarativeSum);
	}

}
