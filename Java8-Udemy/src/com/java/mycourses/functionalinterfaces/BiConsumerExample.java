package com.java.mycourses.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class BiConsumerExample {
	
	
	public static void nameAndActivities() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		BiConsumer<String, List<String>> nameAndActivities = (name, activities) -> System.out.println(name + " : " + activities);
		
		studentList.forEach((student -> nameAndActivities.accept(student.getName(), student.getActivities())));
	}

	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + " b: " + b);
		biConsumer.accept("Hello", "World");
		
		BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication is: " + a*b);
		BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division is: " + a/b);
		
		multiply.andThen(division).accept(10, 5);
		
		nameAndActivities();
	}

}
