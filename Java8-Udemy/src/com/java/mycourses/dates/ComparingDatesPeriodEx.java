package com.java.mycourses.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodEx {

	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.of(2018, 1, 1);
		LocalDate localDate2 = LocalDate.of(2018, 12, 31);
		
		Period period1 = localDate1.until(localDate2);
		System.out.println(period1);
		System.out.println(period1.getYears());
		
		System.out.println(Period.ofDays(10));
		System.out.println(Period.ofYears(20));
		
		System.out.println(Period.between(localDate1, localDate2));
	}

}
