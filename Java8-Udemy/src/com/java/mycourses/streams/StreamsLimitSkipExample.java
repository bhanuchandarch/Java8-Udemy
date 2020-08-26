package com.java.mycourses.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	private static Optional<Integer> limit(List<Integer> integerList) {
		return integerList.stream()
						.limit(2)
						.reduce(Integer::sum);
	}
	
	private static Optional<Integer> skip(List<Integer> integerList) {
		return integerList.stream()
						.skip(2)
						.reduce(Integer::max);
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(12, 45, 66, 67, 87);
		
		Optional<Integer> limitResult = limit(integerList);
		
		if(limitResult.isPresent()) {
			System.out.println("The Limit Result is: " + limitResult.get());
		} else {
			System.out.println("No Input Passed");
		}
		
		Optional<Integer> skipResult = skip(integerList);
		
		if(skipResult.isPresent()) {
			System.out.println("The Skip Result is: " + skipResult.get());
		} else {
			System.out.println("No Input Passed");
		}
	}

}
