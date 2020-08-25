package com.java.mycourses.methodreference;

import java.util.function.Function;

public class FunctionMethodRefExample {

	static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
	
	static Function<String, String> toUpperCaseMethodRef = String::toUpperCase;
	
	public static void main(String[] args) {
		
		System.out.println("To Upper Case Lambda: " + toUpperCaseLambda.apply("Hello"));
		System.out.println("To Upper Case Method Ref: " + toUpperCaseMethodRef.apply("Hello"));
	}

}
