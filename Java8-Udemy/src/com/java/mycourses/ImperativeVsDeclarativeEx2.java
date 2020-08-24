package com.java.mycourses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeEx2 {

	public static void main(String[] args) {

		// Remove Duplicates from the list of integers
		
		/**
		 * Imperative - How Style of Programming
		 */
		
		List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9);
		
		List<Integer> impUniqueList = new ArrayList<Integer>();
		
		for (Integer integer : integerList) {
			if(!impUniqueList.contains(integer)) {
				impUniqueList.add(integer);
			}
		}
		
		System.out.println("Imperative Unique List: " + impUniqueList);
		
		/**
		 * Declarative - What Style of Programming
		 */
		
		List<Integer> uniqueList = integerList.stream()
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println("Declarative Unique List: " + uniqueList);
		
	}

}
