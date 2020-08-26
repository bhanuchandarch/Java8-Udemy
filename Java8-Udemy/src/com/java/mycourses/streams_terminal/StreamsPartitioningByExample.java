package com.java.mycourses.streams_terminal;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsPartitioningByExample {

	private static void partitioningBy_1() {
		
		Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.8;
		
		Map<Boolean, List<Student>> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(partitioningBy(gpaPredicate));
		System.out.println(studentMap);
	} 
	
	private static void partitioningBy_2() {
		
		Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.8;
		
		Map<Boolean, Set<Student>> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(partitioningBy(gpaPredicate, Collectors.toSet()));
		System.out.println(studentMap);
	}

	public static void main(String[] args) {
		partitioningBy_1();
		partitioningBy_2();
	}

}
