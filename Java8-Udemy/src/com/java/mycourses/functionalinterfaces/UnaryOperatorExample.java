package com.java.mycourses.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<String> unaryOp = (s) -> s.concat("default");
	
	public static void main(String[] args) {
		System.out.println(unaryOp.apply("java 8 "));
	}

}
