package com.java.mycourses.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	
	private static int getMaxValue(List<Integer> integerList) {
		return integerList.stream()
//						.reduce(0, (a, b) -> a>b ? a : b);
						.reduce(0, Integer::max);
		
	}
	
	private static Optional<Integer> getMaxValueOptional(List<Integer> integerList) {
		return integerList.stream()
				.reduce(Integer::max);
	}
	
	private static Optional<Integer> getMinValueOptional(List<Integer> integerList) {
		return integerList.stream()
//						.reduce(0, (a, b) -> a<b ? a : b);
						.reduce(Integer::min);
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(12, 45, 66, 67, 87);
//		List<Integer> integerList = new ArrayList<Integer>();
		
		System.out.println("Max Value is: " + getMaxValue(integerList));
		Optional<Integer> maxValueOptional = getMaxValueOptional(integerList);
		
		if(maxValueOptional.isPresent()) {
			System.out.println("Max Value Optional is: " + maxValueOptional.get());
		} else {
			System.out.println("No Max Value found");
		}
		
		Optional<Integer> minValueOptional = getMinValueOptional(integerList);
		
		if(minValueOptional.isPresent()) {
			System.out.println("Min Value Optional is: " + minValueOptional.get());
		} else {
			System.out.println("No Min Value Found");
		}
	}

}
