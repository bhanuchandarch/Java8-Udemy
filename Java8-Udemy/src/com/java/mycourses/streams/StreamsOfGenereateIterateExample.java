package com.java.mycourses.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfGenereateIterateExample {

	public static void main(String[] args) {
		
		//of() function
		Stream<String> stringStream = Stream.of("Hello", "World", "Hi");
		
		stringStream.forEach(System.out::println);
		
		//iterate() function
		Stream.iterate(1, x -> x*2)
			.limit(10)
			.forEach(System.out::println);
		
		//generate() function
		Supplier<Integer> supplier = new Random()::nextInt;
		Stream.generate(supplier)
			.limit(5)
			.forEach(System.out::println);;
	}

}
