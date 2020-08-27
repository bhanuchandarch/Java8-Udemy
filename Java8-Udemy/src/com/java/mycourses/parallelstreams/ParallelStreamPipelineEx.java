package com.java.mycourses.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class ParallelStreamPipelineEx {

	
	
	public static List<String> printActivitiesSequential() {
		long startTime = System.currentTimeMillis();
		
		List<String> studentActivitiesSequential = StudentDataBase.getAllStudents().stream()	// Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream) //Stream<String>
				.distinct() // unique elements in Stream<String>
				.sorted()  // sorted Stream<String>
				.collect(Collectors.toList());
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Duration for Sequential: " + (endTime - startTime));
		
		return studentActivitiesSequential;
	}
	
	public static List<String> printActivitiesParallel() {
		long startTime = System.currentTimeMillis();
		
		List<String> studentActivitiesParallel = StudentDataBase.getAllStudents().stream()	// Stream<Student>
			.parallel()
			.map(Student::getActivities) //Stream<List<String>>
			.flatMap(List::stream) //Stream<String>
			.distinct() // unique elements in Stream<String>
			.sorted()  // sorted Stream<String>
			.collect(Collectors.toList());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Duration for Parallel: " + (endTime - startTime));
		
		return studentActivitiesParallel;
	}
	
	public static void main(String[] args) {
		printActivitiesSequential();
		printActivitiesParallel();
	}

}
