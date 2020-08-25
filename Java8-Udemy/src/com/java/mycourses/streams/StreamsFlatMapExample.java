package com.java.mycourses.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsFlatMapExample {

	public static List<String> printActivities() {
		return StudentDataBase.getAllStudents().stream()	// Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream) //Stream<String>
				.distinct() // unique elements in Stream<String>
				.sorted()  // sorted Stream<String>
				.collect(Collectors.toList());
	}
	
	public static long getStudentActivitiesCount() {
		return StudentDataBase.getAllStudents().stream()	// Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream) //Stream<String>
				.distinct() // unique elements in Stream<String>
				.count();
	}
	
	public static void main(String[] args) {
		System.out.println(printActivities());
		System.out.println(getStudentActivitiesCount());
	}

}
