package com.java.mycourses.streams_terminal;

import java.util.stream.Collectors;

import com.java.mycourses.data.StudentDataBase;

public class StreamsCountingExample {

	private static long counting() {
		return StudentDataBase.getAllStudents()
					.stream()
					.filter((s) -> s.getGpa() >= 3.9)
					.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		System.out.println("Count of Elements: " + counting());
	}

}
