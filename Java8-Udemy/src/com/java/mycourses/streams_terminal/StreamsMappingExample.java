package com.java.mycourses.streams_terminal;

import java.util.List;
import java.util.stream.Collectors;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamsMappingExample {

	public static void main(String[] args) {
		List<String> list = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		System.out.println(list);
	}

}
