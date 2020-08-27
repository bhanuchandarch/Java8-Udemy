package com.java.mycourses.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.java.mycourses.data.Student;
import com.java.mycourses.data.StudentDataBase;

public class DefaultMethodsExample1 {

	static Consumer<Student> studentConsumer = ((student) -> System.out.println(student));
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

	public static void sortByName(List<Student> studentList) {
		System.out.println("After Sort: ");
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer);
	}
	
	private static void sortByGpa(List<Student> studentList) {
		System.out.println("After Sort: ");
		Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
		studentList.sort(gpaComparator);
		studentList.forEach(studentConsumer);
	}
	
	private static void comparatorChaining(List<Student> studentList) {
		Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
		
		System.out.println("After Comparator Chaining");
		studentList.sort(gradeComparator.thenComparing(nameComparator));
		studentList.forEach(studentConsumer);
	}
	
	public static void sortWithNull(List<Student> studentList) {
		System.out.println("After Sort Nulls First");
		Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
		studentList.sort(studentComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("Before Sort: " + studentList);
		
		studentList.forEach(studentConsumer);
		
		// Sort Type 1 - by Name
//		sortByName(studentList);
		
		// Sort Type 1 - by GPA
//		sortByGpa(studentList);
		
		// Sort Type 3 - Comparator Chaining (Grade + Name)
//		comparatorChaining(studentList); 
		
		// Sort Type 4 - With Null Values (.nullsFirst)
		sortWithNull(studentList);
	}

}
