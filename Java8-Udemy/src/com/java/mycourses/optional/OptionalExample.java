package com.java.mycourses.optional;

import java.util.Optional;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class OptionalExample {

	private static String getStudentName() {
//		Student student = StudentDataBase.studentSupplier.get();
		Student student = null;
		
		if(student != null) {
			return student.getName();
		}
		
		return null;
	}
	
	private static Optional<String> getStudentNameOptional() {
//		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		
		if(studentOptional.isPresent()) {
			return studentOptional.map(Student::getName);
		}
		
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		String studentName = getStudentName();
		System.out.println(studentName);
//		System.out.println("Length of Student Name: " + studentName == null ? "No Student Found" : studentName.length());
		
		if(studentName != null) {
			System.out.println(studentName.length());
		} else {
			System.out.println("No Student Found");
		}
		
		Optional<String> studentNameOptional = getStudentNameOptional();
		
		if(studentNameOptional.isPresent()) {
			System.out.println("Length of Studnet Name: " + studentNameOptional.get().length());
		}
	}

}
