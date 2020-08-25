package com.java.mycourses.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		// Student name and their activities in a map
		
		Predicate<Student> studentPredicate = (student) -> student.getGradeLevel() >= 3;
		Predicate<Student> studentGpaPredicate = (student) -> student.getGpa() >= 3.9;
		
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().parallelStream() //Stream of Students
					.filter(studentPredicate.and(studentGpaPredicate))	// Filtered Stream of Students
					.collect(Collectors.toMap(Student::getName, Student::getActivities)); // Map of Students and Activities
		
		System.out.println(studentMap);
	}

}
