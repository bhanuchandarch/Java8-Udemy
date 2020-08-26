package com.java.mycourses.streams;

import java.util.Optional;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsFindAnyFindFirstExample {

	private static Optional<Student> findAnyStudent() {
		return StudentDataBase.getAllStudents()
					.stream()
					.filter((student) -> student.getGpa() >= 3.9)
					.findAny();
	}
	
	private static Optional<Student> findFirstStudent() {
		return StudentDataBase.getAllStudents()
					.stream()
					.filter((student) -> student.getGpa() >= 3.9)
					.findFirst();
	}
	
	public static void main(String[] args) {
		Optional<Student> findAnyStudent = findAnyStudent();
		
		if(findAnyStudent.isPresent()) {
			System.out.println("findAnyStudent: " + findAnyStudent.get());
		} else {
			System.out.println("Student Not Found");
		}
		
		Optional<Student> findFirstStudent = findFirstStudent();
		
		if(findFirstStudent.isPresent()) {
			System.out.println("findFirstStudent: " + findFirstStudent.get());
		} else {
			System.out.println("Student Not Found");
		}
	}

}
