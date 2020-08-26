package com.java.mycourses.streams_terminal;

import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsSumAvgExample {

	public static void main(String[] args) {
		System.out.println("SummingInt: " + StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNotebooks)));
		System.out.println("AveragingInt: " + StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNotebooks)));
	}

}
