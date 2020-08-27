package com.java.mycourses.dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateEx {

	public static void main(String[] args) {
		
		// Option 1
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date: " + localDate);
		
		// Option 2
		LocalDate localDate1 = LocalDate.of(2020, 8, 27);
		System.out.println("Local Date1: " + localDate1);
		
		// Option 3
		LocalDate localDate2 = LocalDate.ofYearDay(2020, 365);
		System.out.println("Local Date2: " + localDate2);
		
		// Get values from Local Date
		Month currentMonth = LocalDate.now().getMonth();
		System.out.println("Current Month: " + currentMonth);
		System.out.println("Current MonthValue: " + localDate.getMonthValue());
		System.out.println("Day of The Year: " + localDate.getDayOfYear());
		
		// Modify the Local Date
		System.out.println(localDate.plusDays(5));
		System.out.println(localDate.plusMonths(3));
		System.out.println(localDate.withYear(2019)); // Changes year
		
		//Temporal Field
		System.out.println(localDate.with(ChronoField.YEAR, 2016));
		
		System.out.println(localDate.isLeapYear());
		System.out.println(localDate.minusYears(1).isLeapYear());
		System.out.println(localDate.isEqual(localDate1));
	}

}
