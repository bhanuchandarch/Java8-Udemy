package com.java.mycourses.dates;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample {

	public static void main(String[] args) {
		System.out.println(ZonedDateTime.now());
		
		System.out.println(ZonedDateTime.now().getOffset());
		
		System.out.println(ZonedDateTime.now().getZone().getId());
		
		ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
		
		System.out.println(ZoneId.getAvailableZoneIds().size());
	}

}
