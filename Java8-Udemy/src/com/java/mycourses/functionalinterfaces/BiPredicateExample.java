package com.java.mycourses.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class BiPredicateExample {

	static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >=3 && gpa >= 3.9;
	static List<Student> studentList = StudentDataBase.getAllStudents();
	static BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " " + activities);
	
	static Consumer<Student> studentConsumer = (student) -> {
		if(biPredicate.test(student.getGradeLevel(), student.getGpa())) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	};
	
	private static void printNameAndActivities() {
		studentList.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		printNameAndActivities();
	}

}
