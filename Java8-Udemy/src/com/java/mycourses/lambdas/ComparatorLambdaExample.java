package com.java.mycourses.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		/**
		 * Before Java 8
		 */
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("Result of the comparotor is: " + comparator.compare(5, 2));
		
		/**
		 * After Java 8 Lambdas
		 */
		
		Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compareTo(o2);
		
		System.out.println("Result of Lambda Comparator is: " + comparatorLambda.compare(6, 4));
		
	}

}
