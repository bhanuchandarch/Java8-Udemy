package com.java.mycourses.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsComparator {

	public static List<Student> sortStudentsByName() {
		
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getName))
			.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpa() {
		
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getGpa))
			.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpaDesc() {
		
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getGpa).reversed())
			.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println("Students Sorted By Name: ");
		sortStudentsByName().forEach(System.out::println);
		
		System.out.println("Students Sorted By GPA: ");
		sortStudentsByGpa().forEach(System.out::println);
		
		System.out.println("Students Sorted By GPA Desc: ");
		sortStudentsByGpaDesc().forEach(System.out::println);
	}

}
