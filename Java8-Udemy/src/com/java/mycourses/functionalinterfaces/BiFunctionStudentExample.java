package com.java.mycourses.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class BiFunctionStudentExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (studentList, studentPredicate) -> {
		Map<String, Double> studentGradeMap = new HashMap();
		
		studentList.forEach((student) -> {
			if(studentPredicate.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());
			}
		});
		
		return studentGradeMap;
	};
	
	public static void main(String[] args) {
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1));
	}

}
