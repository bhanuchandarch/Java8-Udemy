package com.java.mycourses.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class StreamReduceExample {

	public static int perfomMultiplication(List<Integer> integerList) {
		return integerList.stream()
			.reduce(1, (a, b) -> a*b); // 1 is identity
	}
	
	public static Optional<Integer> perfomMultiplicationWithOutIdentity(List<Integer> integerList) {
		return integerList.stream()
			.reduce((a, b) -> a*b); // without identity
	}
	
	public static Optional<Student> getHighestGpaStudent() {
		return StudentDataBase.getAllStudents()
					.stream()
					.reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
	}
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 5, 7);
		List<Integer> integers1 = new ArrayList<Integer>();
		
		System.out.println(perfomMultiplication(integers));
		System.out.println(perfomMultiplicationWithOutIdentity(integers).isPresent());
		System.out.println(perfomMultiplicationWithOutIdentity(integers).get());
		System.out.println(perfomMultiplicationWithOutIdentity(integers1).isPresent());
		
		Optional<Student> highestGpaStudent = getHighestGpaStudent();
		
		if(highestGpaStudent.isPresent()) {
			System.out.println(highestGpaStudent.get());
		}
	}

}
