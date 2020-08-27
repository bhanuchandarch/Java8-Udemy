package com.java.mycourses.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {
		// Use Case: Sort the list of names in alphabetical order
		
		List<String> stringList = Arrays.asList("Adam", "Jesse", "Alex", "Mike", "Rick");
		
		// Prior Java 8
		Collections.sort(stringList);
		System.out.println("Sorted List using Collections class: " + stringList);
		
		// After Java 8
		stringList.sort(Comparator.naturalOrder());
		System.out.println("Sorted List using List Sort: " + stringList);
		
	}

}
