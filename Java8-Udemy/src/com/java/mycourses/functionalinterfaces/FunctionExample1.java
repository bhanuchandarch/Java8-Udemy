package com.java.mycourses.functionalinterfaces;

public class FunctionExample1 {

	private static String performConcat(String str) {
		return FunctionExample.addSomeString.apply(str);
	}
	
	public static void main(String[] args) {
		System.out.println(performConcat("Hello"));
	}

}
