package com.java.mycourses.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println("Local Date: " + localDate);
		System.out.println("Local Time: " + localTime);
		System.out.println("Local DateTime: " + localDateTime);
	}

}
