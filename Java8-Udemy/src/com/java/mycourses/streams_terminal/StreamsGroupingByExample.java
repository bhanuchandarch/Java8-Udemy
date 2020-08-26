package com.java.mycourses.streams_terminal;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsGroupingByExample {

	private static void groupStudentByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
					.stream()
					.collect(groupingBy(Student::getGender));
		
		System.out.println(studentMap);
	}
	
	private static void customizedGroupBy() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
					.stream()
					.collect(groupingBy(s -> s.getGpa()>=3.8 ? "Outstanding" : "Average"));
		
		System.out.println(studentMap);
	}
	
	private static void twoLevelGrouping_1() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
															.stream()
															.collect(groupingBy(Student::getGradeLevel, 
															groupingBy(s -> s.getGpa()>=3.8 ? "Outstanding" : "Average")));
		System.out.println(studentMap);
	}
	
	private static void twoLevelGrouping_2() {
		Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
													.stream()
													.collect(groupingBy(Student::getGradeLevel, 
													Collectors.summingInt(Student::getNotebooks)));
		System.out.println(studentMap);
	}
	
	private static void threeArgumentGroupBy() {
		LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
		.stream()
		.collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
		
		System.out.println(studentLinkedHashMap);
	}
	
	private static void calculateTopGpa() {
		Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
		.stream()
		.collect(groupingBy(Student::getGradeLevel, collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		
		System.out.println(studentMap);
	}
	
	public static void main(String[] args) {
		groupStudentByGender();
		customizedGroupBy();
		twoLevelGrouping_1();
		twoLevelGrouping_2();
		threeArgumentGroupBy();
		calculateTopGpa();
		
		// Same goes to calculate least gpa, but use minBy and collectingAndThen
	}

}
