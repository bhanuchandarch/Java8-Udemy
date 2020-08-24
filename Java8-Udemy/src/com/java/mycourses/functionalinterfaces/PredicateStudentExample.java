package com.java.mycourses.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class PredicateStudentExample {

	static List<Student> studentList = StudentDataBase.getAllStudents();
	static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;
	
	static Consumer<Student> c1 = (student) -> {
		if(p1.test(student)) {
			System.out.println(student);
		}
	};
	
	static Consumer<Student> c2 = (student) -> {
		if(p2.test(student)) {
			System.out.println(student);
		}
	};
	
	static Consumer<Student> c3 = (student) -> {
		if(p1.or(p2).test(student)) {
			System.out.println(student);
		}
	};
	
	private static void filterStudentsByGradeLevel() {
		System.out.println("filterStudentsByGradeLevel: ");
		studentList.forEach((student) -> c1.accept(student));
	}
	
	private static void filterStudentsByGpa() {
		System.out.println("filterStudentsByGpa: ");
		studentList.forEach((student) -> c2.accept(student));
	}

	private static void filterStudents() {
		System.out.println("filterStudents: ");
		studentList.forEach((student) -> c3.accept(student));
	}
	
	public static void main(String[] args) {
		filterStudentsByGradeLevel();
		filterStudentsByGpa();
		filterStudents();
	}


}
