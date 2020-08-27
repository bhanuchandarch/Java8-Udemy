package com.java.mycourses.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateEx {

	public static void main(String[] args) {
		
		// Java Util Date to LocalDate
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
		
		// LocalDate to java util date
		Date fromDate = Date.from(LocalDate.now().atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(fromDate);
		
		// Java Sql Date to LocalDate
		java.sql.Date sqlDate = java.sql.Date.valueOf(LocalDate.now());
		System.out.println(sqlDate);
		
		// LocalDate to sql date
		System.out.println(sqlDate.toLocalDate());
	}

}
