package com.java.mycourses.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsMapExample {

	public static List<String> namesList() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getName)	//Stream<String>
				.map(String::toUpperCase) //Stream<String>
				.collect(Collectors.toList()); // List<String>
	}
	
	public static Set<String> namesSet() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getName)	//Stream<String>
				.map(String::toUpperCase) //Stream<String>
				.collect(Collectors.toSet()); // Set<String>
	}
	
	public static void main(String[] args) {
		// print Student names to console
		System.out.println(namesList());
		System.out.println(namesSet());
	}

}
