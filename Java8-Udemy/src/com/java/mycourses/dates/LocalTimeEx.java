package com.java.mycourses.dates;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalTime localTime1 = LocalTime.of(23, 23);
		System.out.println(localTime1);
		
		// Getting Values from Local Time instance
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		
		// Modify Values of Local Time
		System.out.println(localTime.minusHours(2));
	}

}
