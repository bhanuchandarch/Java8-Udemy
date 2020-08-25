package com.java.mycourses.methodreference;

import java.util.function.Predicate;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class RefactorMethodRefExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = RefactorMethodRefExample::greaterThanGradeLevel;
	
	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel() >= 3;
	}
	
	public static void main(String[] args) {
		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
		System.out.println(p2.test(StudentDataBase.studentSupplier.get()));
	}

}
