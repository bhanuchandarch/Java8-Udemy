package com.java.mycourses.methodreference;

import java.util.function.Consumer;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class ConsumerMethodRefExample {

	static Consumer<Student> c1 = System.out::println;
	static Consumer<Student> c2 = Student::printListOfActivities;
	
	public static void main(String[] args) {
		StudentDataBase.getAllStudents().forEach(c1);
		StudentDataBase.getAllStudents().forEach(c2);
	}

}
