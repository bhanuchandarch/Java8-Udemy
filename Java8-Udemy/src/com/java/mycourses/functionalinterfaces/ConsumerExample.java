package com.java.mycourses.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class ConsumerExample {
	static Consumer<Student> consumer2 = (student) -> System.out.println(student);;
	static Consumer<Student> consumer3 = (student) -> System.out.print(student.getName());
	static Consumer<Student> consumer4 = (student) -> System.out.println(student.getActivities());
	static List<Student> studentList = StudentDataBase.getAllStudents();

	public static void printName() {
		studentList.forEach(consumer2);
	}
	
	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities: ");
		studentList.forEach(consumer3.andThen(consumer4)); // Consumer Chaining
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		System.out.println();
		System.out.println("printNameAndActivitiesUsingCondition: ");
		studentList.forEach((student) -> {
			if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
				consumer3.andThen(consumer4).accept(student);
			}
		});
	}
	
	public static void main(String[] args) {
		
		Consumer<String> consumer1 = (str) -> System.out.println(str.toUpperCase());
		consumer1.accept("Hello");
		printName();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
	}
	
}
