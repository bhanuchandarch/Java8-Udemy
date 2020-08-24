package com.java.mycourses.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	static Predicate<Integer> p1 = (a) -> a%2 == 0;
	static Predicate<Integer> p2 = (a) -> a%5 == 0;
	
	public static void predicateAnd() {
		System.out.println("Predicate And Result: " + p1.and(p2).test(10)); //predicate chaining
		System.out.println("Predicate And Result: " + p1.and(p2).test(9));
	}
	
	public static void predicateOr() {
		System.out.println("Predicate Or Result: " + p1.or(p2).test(10));
		System.out.println("Predicate Or Result: " + p1.or(p2).test(8));
	}
	
	public static void predicateNegate() {
		System.out.println("Predicate Negate for Or Result: " + p1.or(p2).negate().test(8));
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(p1.test(4));
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
