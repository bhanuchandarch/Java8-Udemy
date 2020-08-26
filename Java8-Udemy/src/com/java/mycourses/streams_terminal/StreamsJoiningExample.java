package com.java.mycourses.streams_terminal;

import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsJoiningExample {

	private static String joining_1() {
		return StudentDataBase.getAllStudents()
					.stream()
					.map(Student::getName)
					.collect(Collectors.joining());
	}
	
	private static String joining_2() {
		return StudentDataBase.getAllStudents()
					.stream()
					.map(Student::getName)
					.collect(Collectors.joining(" "));
	}
	
	private static String joining_3() {
		return StudentDataBase.getAllStudents()
					.stream()
					.map(Student::getName)
					.collect(Collectors.joining(" ", "(", ")"));
	}
	
	public static void main(String[] args) {
		System.out.println("joining 1: " + joining_1());
		System.out.println("joining 2: " + joining_2());
		System.out.println("joining 3: " + joining_3());
	}

}
