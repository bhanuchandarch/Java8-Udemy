package com.java.mycourses.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedEx {

	public static void main(String[] args) {
		List<Integer> integerList = IntStream.rangeClosed(1, 10000)
			.boxed()
			.collect(Collectors.toList());
		
		sequentialSum(integerList);
		parallelSum(integerList);
	}

	private static int sequentialSum(List<Integer> integerList) {
		long start = System.currentTimeMillis();
		Integer sum = integerList.stream().reduce(0, Integer::sum); // Performs Unboxing from Integer to int
		long end = System.currentTimeMillis();
		System.out.println("Duration for Sequential: " + (end - start));
		
		return sum;
	}
	
	private static int parallelSum(List<Integer> integerList) {
		long start = System.currentTimeMillis();
		Integer sum = integerList.parallelStream().reduce(0, Integer::sum);
		long end = System.currentTimeMillis();
		System.out.println("Duration for Parallel: " + (end - start));
		
		return sum;
	}

}
