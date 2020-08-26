package com.java.mycourses.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

	private static List<Integer> mapToObj() {
		return IntStream.rangeClosed(1, 5)
				.mapToObj((i) -> Integer.valueOf(i))
				.collect(Collectors.toList());
	}
	
	private static Long mapToLong() {
		return IntStream.range(1, 5)
				.mapToLong((i) -> Long.valueOf(i))
				.sum();
	}
	
	public static void main(String[] args) {
		System.out.println("mapToObj: " + mapToObj());
		System.out.println("mapToLong: " + mapToLong());
		
		// Same goes with mapToDouble
	}

}
