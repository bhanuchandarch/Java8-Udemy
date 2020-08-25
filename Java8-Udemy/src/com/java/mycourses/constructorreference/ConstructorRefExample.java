package com.java.mycourses.constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.java.mycourses.data.Student;

public class ConstructorRefExample {

	static Supplier<Student> studentSupplier = Student::new;
	static Function<String, Student> studentFunction = Student::new; 
	
	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentFunction.apply("Hello"));
	}

}
