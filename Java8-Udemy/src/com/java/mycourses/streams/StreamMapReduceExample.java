package com.java.mycourses.streams;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamMapReduceExample {
	
	// Total no.of notebooks whole collection has
	private static int getNoOfNotebooks() {
		return StudentDataBase.getAllStudents()
			.stream()
			.filter((student) -> student.getGradeLevel() >= 3)
			.filter((student) -> student.getGender().equals("female"))
			.map(Student::getNotebooks)
//			.reduce(0, (a, b) -> a+b);	// Lambda
			.reduce(0, Integer::sum);	// Method Ref
	}
	
	public static void main(String[] args) {
		System.out.println("Total No.of Notebooks: " + getNoOfNotebooks());
	}

}
