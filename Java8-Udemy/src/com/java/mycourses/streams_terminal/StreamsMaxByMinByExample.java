package com.java.mycourses.streams_terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsMaxByMinByExample {

	private static Optional<Student> minBy() {
		return StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	private static Optional<Student> maxBy() {
		return StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static void main(String[] args) {
		System.out.println("MaxBy Collector: " + maxBy().get());
		System.out.println("MinBy Collector: " + minBy().get());
	}

}
