package com.java.mycourses.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> function = (name) -> name.toUpperCase();
	
	static Function<String, String> addSomeString = (name) -> name.concat(" World");
	
	public static void main(String[] args) {
		System.out.println("The Result is: " + function.apply("Hello"));
		System.out.println("The Result of andThen is: " + function.andThen(addSomeString).apply("Hello"));
		System.out.println("The Result of compose is: " + function.compose(addSomeString).apply("Hello"));
	}

}
