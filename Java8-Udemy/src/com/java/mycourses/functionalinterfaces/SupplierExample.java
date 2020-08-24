package com.java.mycourses.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Student> studentSupplier = () -> {
			return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
		};
		
		Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
		
		System.out.println("Student is: " + studentSupplier.get());
		System.out.println("List of Students: " + listSupplier.get());
	}

}
