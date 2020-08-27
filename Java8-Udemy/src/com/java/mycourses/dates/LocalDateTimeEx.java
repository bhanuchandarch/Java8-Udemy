package com.java.mycourses.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		// Same like LocalDate and LocalTime
		
		// Converting LocalDate, LocalTime to LocalDateTime
		LocalDate localDate = LocalDate.of(2019, 1, 1);
		LocalDateTime localDateTime1 = localDate.atTime(23, 11, 10);
		System.out.println(localDateTime1);
		
		// Same for LocalTime
		LocalDateTime localDateTime2 = LocalTime.now().atDate(LocalDate.of(2018, 2, 15));
		System.out.println(localDateTime2);
		
		// Convert LocalDateTime to LocalDate and LocalTime
		LocalDate localDate2 = localDateTime.toLocalDate();
		System.out.println(localDate2);
		System.out.println(localDateTime.toLocalTime());
	}

}
